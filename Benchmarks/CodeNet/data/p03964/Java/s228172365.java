import java.util.*;
import java.io.*;
class Main {
    static long ans=0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());

        for(int i=1; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int ra=Integer.parseInt(st.nextToken());
            int rb=Integer.parseInt(st.nextToken());
            if(ra>a || rb>b){
                int l=1;
                int tmpa=ra,tmpb=rb;
                while(tmpa<a || tmpb<b){
                    l++;
                    tmpa=ra*l;
                    tmpb=rb*l;
                }
                a=tmpa;
                b=tmpb;
            }
            else{
                int l=1;
                int tmpa=1,tmpb=1;
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