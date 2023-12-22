import java.util.Scanner;
public class Main {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int A = sc.nextInt();
         int B = sc.nextInt();
         int C = sc.nextInt();
         int K = sc.nextInt();
         
         int ans = 0;
         
         if(K - A <= 0){
             ans = 1 * K;
         }else if(K - A - B <= 0){
             ans = 1 * A;
         }else{
             ans = 1 * A + (-1) * (K - A - B);
         }
         System.out.println(ans);
    }
}