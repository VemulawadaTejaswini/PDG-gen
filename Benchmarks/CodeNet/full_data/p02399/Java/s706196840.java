import java.util.Scanner;
 
class Main{
  public static void main(String[] arg){
    int a, b, d, r;
    double f;
    Scanner in = new Scanner(System.in);
    a = in.nextInt();
    b = in.nextInt();
    d = a/b;
    r = a%b;
    f = (double)a/b;
    System.out.printf("%d %d %.6f",d,r,f);
    }
}