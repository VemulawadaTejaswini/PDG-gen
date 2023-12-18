import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int N = scan.nextInt();
    int A = scan.nextInt();
    int B = scan.nextInt();
    int max = 0;
    int min = 0;

    if(A==N){
      max=B;
      min=B;
    }else if(B==N){
      max=A;
      min=A;
    }else if(A+B>=N){
      if(A>B){
        max=B;
        min=B-(N-A);
      }else{
        max=A;
        min=A-(N-B);
      }
    }else {
      if (A>B) {
        max=B;
      }else{
        max=A;
      }
    }
    System.out.println(max+" "+min);
  }
}
