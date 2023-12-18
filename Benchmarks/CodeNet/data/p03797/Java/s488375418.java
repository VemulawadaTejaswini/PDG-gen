import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int ans=0;
        if(c<=2*s){
            ans+=c/2;
        }
        else{
            ans+=s;
            c-=2*s;
            ans+=c/4;
        }
        System.out.println(ans);

    }


}
