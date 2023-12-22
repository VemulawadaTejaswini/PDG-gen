import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Main{
    public static void main(String[] args) throws IOException{
        final PrintWriter out = new PrintWriter(System.out);
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        final String[] in = br.readLine().split(" ");
        final int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = Integer.parseInt(in[i]);
        }
        int num = 0;
        for(int i = 0; i<n; i++){
            int mini = i;
            for(int j = i+1; j<n; j++){
                if(a[j]<a[mini]) mini = j;
            }
            if(i!=mini){
                num++;
                final int t = a[i];
                a[i] = a[mini];
                a[mini] = t;
            }
        }
        out.print(a[0]);
        for(int i = 1; i<n; i++)
            out.print(" "+a[i]);
        out.println();
        out.println(num);
        out.flush();
    }
}