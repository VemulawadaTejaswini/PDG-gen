import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int a = group(x);
    int b = group(y);
    if(a == b) System.out.println("Yes");
    else System.out.println("No");
  }
  public static int group(int a) {
    if(a == 2) return 1;
    else if(a == 4 || a == 6 || a == 9 || a == 11) return 2;
    else return 3;
  }
}
