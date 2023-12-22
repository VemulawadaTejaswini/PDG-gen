import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    private static long c = 0;
    public static void main(String[] args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        final String[] in = br.readLine().split(" ");
        final int[] s = new int[n];
        for(int i = 0; i<n; i++)
            s[i] = Integer.parseInt(in[i]);
        mergeSort(s, 0, n);
        System.out.println(c);
    }
    private static void mergeSort(int[] a, int l, int r){
        if(l+1<r){
            final int m = (l+r)>>>1;
            mergeSort(a, l, m);
            mergeSort(a, m, r);
            merge(a, l, m, r);
        }
    }
    private static void merge(int[] a, int l, int m, int r){
        final int n1 = m-l;
        final int n2 = r-m;
        final int[] L = new int[n1+1];
        final int[] R = new int[n2+1];
        System.arraycopy(a, l, L, 0, n1);
        System.arraycopy(a, m, R, 0, n2);
        L[n1] = R[n2] = Integer.MAX_VALUE;
        int i = 0, j = 0;
        for(int k = l; k<r; k++){
            if(L[i]<=R[j]){
                a[k] = L[i++];
                c += j;
            }else a[k] = R[j++];

        }
    }
}