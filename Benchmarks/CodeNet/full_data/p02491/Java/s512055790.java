import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a, b;
    a = sc.nextLong();
    b = sc.nextLong();
    System.out.println(a/b + " " + a%b + " " + (double)a/b);
  }
}