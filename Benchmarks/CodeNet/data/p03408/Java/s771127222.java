import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String[] s=new String[N+1];
        for(int i=0;i<N;i++){
            s[i]=sc.next();
        }
        int M=sc.nextInt();
        String[] t=new String[M];
        for(int i=0;i<M;i++){
            t[i]=sc.next();
        }
        
        int ans=0;
        String se,sd;
        for(int i=0;i<N;i++){
            se=s[i];
            int count=0;
            for(int x=0;x<N;x++){
                if(se.equals(s[x])){
                    count++;
                }
            }
            for(int x=0;x<M;x++){
                if(se.equals(t[x])){
                    count--;
                }
            }
            ans=Math.max(ans,count);
        }
        
        for(int i=0;i<M;i++){
            sd=t[i];
            int count=0;
            for(int x=0;x<N;x++){
                if(sd.equals(s[x])){
                    count++;
                }
            }
            for(int x=0;x<M;x++){
                if(sd.equals(t[x])){
                    count--;
                }
            }
            ans=Math.max(ans,count);
        }
        System.out.println(ans);
    }
}