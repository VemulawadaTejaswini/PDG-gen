import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int PP[] = new int[N];
    for (int i = 0;i < N;i++) {
      PP[i] = scan.nextInt();
      if (PP[i] % 2 == 0) {
        if (PP[i] % 3 == 0 || PP[i] % 5 == 0) {
        }
        else{
          System.out.println("DENIED");
          return;
        }
      }
    }
      System.out.println("APPROVED");
  }
}