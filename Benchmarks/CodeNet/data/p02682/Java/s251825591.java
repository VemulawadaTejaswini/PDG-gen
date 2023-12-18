import java.io.*;
import java.util.*;
class Main{
  public static int result = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //1のカード枚数
        int b = sc.nextInt(); //0のカード枚数
        int c = sc.nextInt(); //-1のカード枚数
        int k = sc.nextInt(); //引くカードの枚数
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
