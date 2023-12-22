import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static int n;
    public static int[] A = new int[50];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        String[] in = br.readLine().split(" ");
        for(int i = 0; i < n; i++) A[i] = Integer.parseInt(in[i]);
        int q = Integer.parseInt(br.readLine());
        in = br.readLine().split(" ");
        for(int i = 0; i < q; i++){
            //int M = Integer.parseInt(in[i]);                                        
            if(solve(0, Integer.parseInt(in[i]))) sb.append("yes\n");
            else sb.append("no\n");
        }
        System.out.print(sb);
    }

    public static boolean solve(int i, int m){
        if(m == 0) return true;
        if(i >= n) return false;
        boolean res = solve(i + 1, m) || solve(i + 1, m - A[i]);
        return res;
    }

}