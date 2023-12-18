import java.util.Scanner;
public class Main{
  public static void main(String[] argas){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    int count = 0;
    if(a[0] == 1) count++;
    if(a[1]  == 1) count++;
    if (a[2] == 1) count++;
    System.out.println(count);
  }
}