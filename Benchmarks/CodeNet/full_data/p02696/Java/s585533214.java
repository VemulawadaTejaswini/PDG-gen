import java.util.Scanner;
class Main{
public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
 
 long A = scan.nextLong();
 long B = scan.nextLong();
 long N = scan.nextLong();
 double K = 0;
 double L = 0;
 int M = 0;
 int H = 0;
 long Y = 0;
 long ans = 0;
 
   for (int x = 0; x < N+1; x++){
      K = (A*x)/B;
      M = (int)K;
      L = x/B;  
      H = (int)L;
      Y = M - (A * H);
     if  (Y >= ans){
       ans = Y;
     }
     else {
       ans += 0;
     }
   }
     System.out.println(ans);
 }
}