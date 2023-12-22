import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
    static int sum=0;
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder();
        FS fs = new FS();
        int n = fs.nextInt();
        int A[] = new int[n];
        for (int i=0 ;i<A.length;i++){
            A[i]=fs.nextInt();
        }
        mergeSort(A,0,n);
        for (int i=0;i<A.length;i++){
            sb.append(A[i]+" ");
        }
         sb.deleteCharAt(sb.length()-1);
        sb.append("\n"+sum);
        System.out.println(sb.toString());
    }

    private static void mergeSort(int[] a, int left, int right) {
        if (left+1<right){
            int mid = (left+right)/2;
            mergeSort(a,left,mid);
            mergeSort(a,mid,right);
            merge(a,left,mid,right);
        }
    }

    private static void merge(int[] a, int left, int mid, int right) {
        int n1 = mid - left;
        int n2 = right - mid;
        int[] l = new int[n1+1];
        int[] r = new int[n2+1];
        for (int i=0;i<n1;i++){
            l[i]=a[left+i];
        }
        for (int i=0;i<n2;i++){
            r[i]=a[mid+i];
        }
        l[n1]=Integer.MAX_VALUE;
        r[n2]=Integer.MAX_VALUE;
        int i=0,j=0;

        for (int k = left;k<right;k++){
            if (l[i]<=r[j]){
                a[k]=l[i];
                i++;
                sum++;
            }else {
                a[k]=r[j];
                j++;
                sum++;
            }
        }

    }
static class FS {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        return hasNextByte() ? buffer[ptr++] : -1;
    }

    private boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
    }

    public boolean hasNext() {
        skipUnprintable();
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public int nextInt() {
        return (int) nextLong();
    }

    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
}
}
