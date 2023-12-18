import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      	int pow = 1;
      
      for(int i=1 ; i < 1+n;i++){
      pow = pow * i;
      }
      
      System.out.print(pow%1000000007 );
    }
}