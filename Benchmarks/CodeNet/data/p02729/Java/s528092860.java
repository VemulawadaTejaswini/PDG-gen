import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    inr m = sc.nextInt();
    System.out.println((n * (n - 1) / 2) + (m * (m - 1))/2);
  }
}