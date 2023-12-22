import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] Args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        final int[] h = new int[n+1];
        final StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 1; i<=n; i++){
            h[i] = Integer.parseInt(st.nextToken());
        }
        buildMaxHeap(h, n);
        final StringBuilder sb = new StringBuilder();
        for(int i = 1; i<=n; i++)
            sb.append(' ').append(h[i]);
        System.out.println(sb);
    }
    private static void buildMaxHeap(int[] h, int n){
        for(int i = n>>>1; i>0; i--)
            maxHeapify(h, i, n);
    }
    private static void maxHeapify(int[] a, int i, int n){
        int learge = i;
        do{
            i = learge;
            final int l = i+i;
            final int r = l+1;
            if(l<=n&&a[i]<a[l]) learge = l;
            if(r<=n&&a[learge]<a[r]) learge = r;
            if(i!=learge){
                final int t = a[i];
                a[i] = a[learge];
                a[learge] = t;
                maxHeapify(a, learge, n);
            }
        }while(i!=learge);
    }
}