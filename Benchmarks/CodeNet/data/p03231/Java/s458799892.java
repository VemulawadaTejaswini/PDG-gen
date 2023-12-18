import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        long N=sc.nextLong();
        long M=sc.nextLong();
        String S=sc.next();
        String T=sc.next();
        long L=0;
        int G=0;
        for(int i=1;i<=N;i++){
            if(N%i==0 && M%i==0){
                L=N*M/i;
                G=i;
            }
        }
        int some=0;
//        System.out.println(L+" "+G);
        boolean able =true;
        for(int i=0;i<N;i++){
            if(M*i%N==0){
                some=(int) (M*i/N);
                if(S.charAt(i)!=T.charAt(some)){
                    able=false;
                }
            }
//            System.out.println(able);
        }
        if(able){
            System.out.println(L);
        }else{
            System.out.println(-1);
        }
    }
}