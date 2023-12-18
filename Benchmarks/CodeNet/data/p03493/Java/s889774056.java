import java.util.Scanner;
public class Main{
  public static void main(String[] argas){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    int count = 0;
    for(int i = 0; i < 3; i++){
      char b = a.charAt(i);
	if (b == 1) count++;
    }
    System.out.println(count);
  }
}