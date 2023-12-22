import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        FS fs = new FS();
        int n = fs.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]= fs.nextInt();
        }
        int p = partition(a, 0, n - 1);
        StringBuilder sb = new StringBuilder();
        for (int i=1;i<a.length;i++){
            if (i==p){
                sb.append("["+a[i]+"] ");
                continue;
            }
            sb.append(a[i]+" ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }

    private static int  partition(int[] a, int p, int r) {
        int x = a[r];
        int i = p-1;
        for (int j =p;j<r;j++){
            if (a[j]<x){
                i++;
                exchange(a,j,i);
            }
        }
        exchange(a,i+1,r);
        return i+1;
    }

    private static void exchange(int[] a,int i, int j) {
        int tep = a[j];
        a[j]=a[i];
        a[i]=tep;
    }
}
