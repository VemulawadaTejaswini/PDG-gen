import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(f.readLine());
        int[][] counts = new int[n+1][3];
        String str = f.readLine();
        for(int i = 1; i <= n; i++){
            if(str.charAt(i-1) == 'R'){
                counts[i][0] = counts[i-1][0]+1;
                counts[i][1] = counts[i-1][1];
                counts[i][2] = counts[i-1][2];
            }
            if(str.charAt(i-1) == 'G'){
                counts[i][0] = counts[i-1][0];
                counts[i][1] = counts[i-1][1]+1;
                counts[i][2] = counts[i-1][2];
            }
            if(str.charAt(i-1) == 'B'){
                counts[i][0] = counts[i-1][0];
                counts[i][1] = counts[i-1][1];
                counts[i][2] = counts[i-1][2]+1;
            }
        }
        long sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                char c1 = str.charAt(i);
                char c2 = str.charAt(j);
                char other = '.';
                int idx = -1;
                if(c1 != c2){
                    if(c1 == 'R' && c2 == 'B' || c1 == 'B' && c2 == 'R'){
                        idx = 1;
                        other = 'G';
                    }else if(c1 == 'R' && c2 == 'G' || c1 == 'G' && c2 == 'R'){
                        idx = 2;
                        other = 'B';
                    }else{
                       idx = 0;
                       other = 'R';
                    }
                    sum+=(counts[n][idx]-counts[j+1][idx]);
                    if(j+(j-i) < n && str.charAt(j+(j-i)) == other) sum--;
                }
            }
        }
        out.println(sum);
        out.close();


    }
}
