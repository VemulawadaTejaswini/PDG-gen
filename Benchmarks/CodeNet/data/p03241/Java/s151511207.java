import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        long L =M/N;
        long ans=1;
         for(long i=1;i<=L;i++){
             if(M%i==0){
                 ans =Math.max(i,ans);
             }
         }
        System.out.println(ans);
    }
}