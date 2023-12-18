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
            if(ra>a && rb>b){
                a=ra;
                b=rb;
                continue;
            }
            if(ra>a || rb>b){
                int l=Math.min(a/ra,b/rb)-1;
                // int l=1;
                int tmpa=ra*l,tmpb=rb*l;
                while(tmpa<a || tmpb<b){
                    l++;
                    tmpa=ra*l;
                    tmpb=rb*l;

                }
                a=tmpa;
                b=tmpb;
            }
            else{
                int l=Math.max(a/ra,b/rb)-1;
                // int l=2;
                int tmpa=ra*l,tmpb=rb*l;
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

// 4
// 1 1
// 1 1
// 1 5
// 1 100

// 3
// 2 3
// 1 1
// 3 2

// 5
// 3 10
// 48 17
// 31 199
// 231 23
// 3 2