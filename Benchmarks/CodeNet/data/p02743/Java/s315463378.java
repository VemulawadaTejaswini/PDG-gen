import java.util.*;

public class Main {
public static void main(String[] args){
  
//int[] data = {1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51};
  
Scanner sc = new Scanner(System.in);
// 整数の入力
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
double aa = Math.sqrt(a);
  double bb = Math.sqrt(b);
  double cc = Math.sqrt(c);
// スペース区切りの整数の入力
//int b = sc.nextInt();
//int c = sc.nextInt();
// 文字列の入力
//String s = sc.next();
// 出力
  if (aa+bb < cc)
System.out.println("yes");
  if (aa+bb >= cc)
System.out.println("no");
}
}