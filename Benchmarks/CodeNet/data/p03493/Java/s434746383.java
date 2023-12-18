import java.util.Scanner;
public class Main{
  public static void main(String[] argas){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int count = 0;
	char a = s.charAt(0);
    char b = s.charAt(1);
    char c = s.charAt(2);
	if (a == 1) count++;
    if(b == 1 ) count++;
    if(c == 1) count++;
    System.out.println(count);
  }
}