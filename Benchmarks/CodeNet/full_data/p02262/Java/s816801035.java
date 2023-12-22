import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Main{
    private static int cnt = 0;
    private static final int G[] = {1, 4, 13, 40, 121, 364, 1093, 3280, 9841, 29524, 88573, 265720, 797161};
    public static void main(String[] args) throws IOException{
        final PrintWriter out = new PrintWriter(System.out);
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        final int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        final int m = shellSort(a);
        out.println(m);
        for(int i = m-1; i>0; i--){
            out.print(G[i]);
            out.print(' ');
        }
        out.println('1');
        out.println(cnt);
        for(int i = 0; i<n; i++)
            out.println(a[i]);
        out.flush();
    }
    private static int shellSort(int A[]){
        final int n = A.length;
        int m = 1;
        while(G[m]<n)
            m++;
        for(int i = m-1; i>=0; i--)
            insertionSort(A, G[i]);
        return m;
    }

    private static void insertionSort(int A[], int g){
        final int n = A.length;
        for(int i = g; i<n; i++){
            final int v = A[i];
            int j = i-g;
            while(j>=0&&A[j]>v){
                A[j+g] = A[j];
                j -= g;
                cnt++;
            }
            A[j+g] = v;
        }
    }
}