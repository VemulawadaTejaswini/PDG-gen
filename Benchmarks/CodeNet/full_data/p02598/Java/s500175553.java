import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int [] logs = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            logs[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(logs);

        int ans = logs[n-1], l = 1, r = logs[n-1];
        while(l <= r){
            int m = (l + r) / 2;
            int knum = k;
            for(int i=n-1;i>=0;i--){
                if(m >= logs[i]) break;
                knum -= (logs[i] / m -1);
                if(logs[i] % m != 0) knum -= 1;
            }

            if(knum >=0){
                ans = (ans > m ? m : ans);
                r = m-1;
            }else{
                l = m+1;
            }
        }
        bw.write(ans+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
