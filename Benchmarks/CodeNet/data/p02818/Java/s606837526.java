
import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    long A = s.nextLong();
    long B = s.nextLong();
    long K = s.nextLong();

    for(long i = 0;i < K;i++){
      if(A > 0){
        A--;
      }else if(B > 0){
        B--;
      }else{
        break;
      }
    }
    System.out.println(A);
    System.out.println(B);
  }
}
