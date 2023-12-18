import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
      
      int x = n-1;
      if(n==m){
        System.out.print(x*x);
      }else{
        System.out.print((x*x)+((m-n)*x));
      }
      
    }
}