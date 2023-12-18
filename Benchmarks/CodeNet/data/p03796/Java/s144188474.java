import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      	long pow = 1;
      
      for(int i=1 ; i <= n;i++){
      pow = pow*i%1000000007;
      }
      System.out.print(pow);
    }
}