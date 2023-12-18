import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main  {
 public static void main(String[] args) { 
   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   int k = Integer.parseInt(reader.readLine());
   String[] s = reader.readLine().split(" ");
   int a = Integer.parseInt(s[0]);
   int b = Integer.parseInt(s[1]);
   if (a % k == 0 || b % k == 0)
     System.out.println("OK");
  	else {
      int i = 1, product = k;
      boolean flag = flag;
      while (!flag && product <= b) {
        product = k * i;
        if (product >= a && product <= b) {
          flag = true;
          break;
        }
       	i++;
      }
      if (flag == true) System.out.println("OK");
      else System.out.println("NG");
    }
 }
}