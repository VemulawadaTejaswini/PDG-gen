import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long sum=1;
    for(int i=1; i<=n; i++) {
      sum*=i;
      System.out.println(sum);
    }
    System.out.println(sum);
  }
}