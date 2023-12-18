import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long A = sc.nextLong();
    long B = sc.nextLong();
    
    long ans = Math.abs(A-B);
    if(ans%2==1 && ans!=1){
      System.out.println(ans/2+1);
    }else if (ans==1){
      System.out.println(1);
    }else{
      System.out.println(ans/2);
    }
  }
}
      
    