//package AtCoder_163;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        long d=Long.parseLong(st.nextToken());
        long sum=0;
        st=new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            sum+=Integer.parseInt(st.nextToken());
        }
        if(sum<=d){
            System.out.println(d-sum);
        }
        else{
            System.out.println(-1);
        }
    }
}
