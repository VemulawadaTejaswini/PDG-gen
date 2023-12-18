import java.util.*;
import java.io.*;
class Main {
    static long ans=0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        long a=Long.parseLong(st.nextToken());
        long b=Long.parseLong(st.nextToken());

        for(long i=1; i<N; i++){
            st = new StringTokenizer(br.readLine());
            long ra=Long.parseLong(st.nextToken());
            long rb=Long.parseLong(st.nextToken());
            if(ra>=a && rb>=b){
                a=ra;
                b=rb;
                continue;
            }
            if(ra>a || rb>b){
                long l=Math.min(a/ra,b/rb)-1;
                // long l=1;
                long tmpa=ra*l,tmpb=rb*l;
                while(tmpa<a || tmpb<b){
                    l++;
                    tmpa=ra*l;
                    tmpb=rb*l;
                }
                a=tmpa;
                b=tmpb;
            }
            else{
                long l=Math.min(a/ra,b/rb)-1;
                // long l=2;
                long tmpa=ra*l,tmpb=rb*l;
                while(tmpa<a || tmpb<b){
                    l++;
                    tmpa=ra*l;
                    tmpb=rb*l;

                }
                a=tmpa;
                b=tmpb;
            }
            
        }

        System.out.println(a+b);
    }
}