import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a, b;
    a = sc.nextInt();
    b = sc.nextInt();
    if (b == 0) {
      b = 1;
    }
    System.out.println(a/b + " " + a%b + " " + (double)a/b);
  }
}