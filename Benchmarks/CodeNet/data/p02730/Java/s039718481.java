import java.util.Scanner;
import java.lang.StringBuilder;

public class Main{
  public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
  String str = scanner.next();
int n =str.length();
  String ans = "Yes";
    StringBuilder sb = new StringBuilder();
  sb.append(str);
if (!(sb.toString().equals(sb.reverse().toString())) )ans="No";
 sb = new StringBuilder();
String s1 = str.substring(0, ((n-1) / 2 )-1);
  sb.append(s1);

if (!(sb.toString().equals(sb.reverse().toString())) )ans="No";

sb = new StringBuilder();
s1 = str.substring(((n+3) / 2)-1,n);
  sb.append(s1);

if (!(sb.toString().equals(sb.reverse().toString())) )ans="No";

    System.out.println(ans);
  }
}