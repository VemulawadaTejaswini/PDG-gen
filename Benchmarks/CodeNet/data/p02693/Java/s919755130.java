import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    for(int i=1; i<K; i++) {
      if(A<=K*i && K*i<=B){
        System.out.println("OK");
      } else {
        continue;
      }
    }
  }
}