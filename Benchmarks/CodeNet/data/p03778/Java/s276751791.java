import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int W = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int ans=0;
        if (a<b){
            ans=Math.max(b-(a+W),ans);
        }
        else{
            ans=Math.max(ans, a-(b+W));
        }
        System.out.println(ans);


    }


}
