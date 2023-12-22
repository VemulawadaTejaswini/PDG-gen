import java.util.Scanner;
 
public class Main {
  public static void main(String[] args ) {
    Scanner sc = new Scanner(System.in);
    long K = sc.nextLong();
    long sevens = 1;
    if (K%2==0 || K%5==0) {
      System.out.println(-1);
    } else {
      int i;
      shori:{
      for (i=1; i<2e9; i++){
         if (sevens*7%K==0){
           System.out.println(i);
           break shori;
         } else {
           sevens=sevens+(long)Math.pow(10,i);
         }
      }
      System.out.println(-1);
      }
    }
  }
}