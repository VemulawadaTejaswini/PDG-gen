import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
import java.lang.Math.*;
public class Main {
    static HashMap<String,Integer> mem = new HashMap<>();
    static int[][] vertice;
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        int m = in.nextInt();
        int mx = (int)1e9;
        int ans = 0;
        vertice = new int[n+1][n+1];
        for(int i=0;i<m;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            vertice[a][b] = c;
            vertice[b][a] = c;
            String t = Integer.toString(a)+"-"+Integer.toString(b);
            String t2 = Integer.toString(b)+"-"+Integer.toString(a);
            mem.put(t,c);
            mem.put(t2,c);
        }
        for(int k =1;k<=n;k++){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    vertice[i][j] = Math.min(vertice[i][j],vertice[i][k]+vertice[k][j]);
                }
            }
        }

        for(int i=1;i<n;i++) {
            for (int j = i+1; j <= n; j++) {
                String t = Integer.toString(i)+"-"+Integer.toString(j);
                if(mem.containsKey(t)){
                    if(mem.get(t)!=vertice[i][j]){
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
