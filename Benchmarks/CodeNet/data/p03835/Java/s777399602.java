import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer K = Integer.parseInt(st.nextToken());
        Integer S = Integer.parseInt(st.nextToken());
        long ans=0;
        for (int i=0; i<=K; i++) {
            if (i==K) {
                ans++;
                break;
            }
            for (int j=0; j<=K; j++) {
                if(i+j>K)
                    continue;
                for (int k=0; k<=K; k++) {
                    if(i+j+k==S)
                        ans++;
                }
            }
        }
        System.out.println(ans);
        
    }

}
