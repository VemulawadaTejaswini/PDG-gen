import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pow{
 public static void main (String[] args) throws java.lang.Exception
 {
 InputStreamReader is = new InputStreamReader(System.in);
 BufferedReader br = new BufferedReader(is);
  System.out.println("入力した値を3乗した値を出力します");
  System.out.println("数値を入力してください");
  double x = Double.parseDouble(br.readLine());
  double kotae = Math.pow(x,3);
  System.out.println(x+"を3乗した値は"+kotae+"です");
 }
}
