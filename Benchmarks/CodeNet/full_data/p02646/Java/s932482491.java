import java.util.Scanner;
public class Main {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int v = sc.nextInt();
      int b = sc.nextInt();
      int w = sc.nextInt();
      int t = sc.nextInt();
      int aPos = a + v * t;
      int bPos = b + w * t;
      if(bPos > aPos){
        System.out.println("NO");
      }else{
        System.out.println("YES");
      }
    }
}