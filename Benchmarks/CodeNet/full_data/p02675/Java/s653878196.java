import java.util.Scanner;
  public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int S = N % 10;
      if(S == 3){
        System.out.println("bon");
        } else if (S == 2 || S == 4 || S == 5 || S == 7 || S == 9) {
        System.out.println("hon");
        } else if (S == 0 || S == 1 || S == 6 || S == 8) {
        System.out.println("pon");
      }
    }
  }