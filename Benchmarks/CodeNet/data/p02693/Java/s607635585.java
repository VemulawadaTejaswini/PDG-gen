import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    for(int i=1; i<1000; i++) {
      if(i%K == 0){
        if(A<=i && i<=B){
          System.out.println("OK");
          break;
        } else if((A>i && i>B)){
          System.out.println("NG");
          break;
        }
      } else if(i%K != 0) {
        continue;
      }
    }
  }
}