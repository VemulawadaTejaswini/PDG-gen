import java.util.Scanner;
class Rp1ABC098A {
    public static void main(String[] args) {

    int A = 0;
    int B = 0;

    Scanner sc = new Scanner(System.in);

    A = sc.nextInt();
    B = sc.nextInt();

    int add = A + B;
    int sub = A - B;
    int C = Math.max(add,sub);

      System.out.println(Math.max(A*B, C));
   }
}