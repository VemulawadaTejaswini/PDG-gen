import java.util.Scanner;
class Rp1ABC098A {
    public static void main(String[] args) {
    
    int A = sc.nextInt();
    int B = sc.nextInt();

    int add = A + B;
    int sub = A - B;
    int mul = A * B;
      max = add;
      if(sub > max) max = sub;
      if(mul > max) max = mul;

      System.out.println(max);
   }
}