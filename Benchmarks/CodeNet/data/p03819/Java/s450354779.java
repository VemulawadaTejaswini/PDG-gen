import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;

 public class Main {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String s = "";

        try {
            s = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int n = Integer.parseInt(s.split(" ")[0]);
        int m = Integer.parseInt(s.split(" ")[1]);

        int[][] nm = new int[n][m];

        for(int i = 0;i < n;i++){
            try {
                s = in.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int l = Integer.parseInt(s.split(" ")[0]);
            int r = Integer.parseInt(s.split(" ")[1]);

            for(int j = 0;j < m;j++){
           if ( l <= j + 1 && j + 1 <= r ){
                    nm[i][j] = 1;
           } else {
           nm[i][j] = 0;
           }
            }
        }

        for(int i = 0;i < m;i++){
       int[] bnt = new int[n];
            for(int j = i;j < m;j = j + i + 1){
                for(int k = 0;k < n;k++){
               if ( nm[k][j] == 1 ){
                        bnt[k] = 1;
               }
                }
            }
            int ans = 0;
            for(int a = 0;a < n;a++){
           if(bnt[a] == 1){
           ans++;
           }
            }
            System.out.println(ans);
        }
   }
 }