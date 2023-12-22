import java.io.*;
import java.util.*;
class A {
  public static int result = 0;
  public static int a=0;
  public static int b=0;
  public static int c=0;
  public static int k=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt(); //1のカード枚数
        b = sc.nextInt(); //0のカード枚数
        c = sc.nextInt(); //-1のカード枚数
        k = sc.nextInt(); //引くカードの枚数
        calc(a,k);
        calc(b,k);
        calc(c,k);
        System.out.println(result);
    }
    public static void calc(int num, int k){
      if(num >= k){
        result += k;
        k-=num;
      }else {
        result += num;
        k=0;
      }
    }
}
