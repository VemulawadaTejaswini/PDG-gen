import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    String[] ab = line.split(" ");
    int a = Integer.parseInt(ab[0]);
    int b = Integer.parseInt(ab[1]);
    int c = Integer.parseInt(ab[2]);

    int[] ans = new int[3];
    if(a <= b && a <= c) {
      ans[0] = a;
      if(b <= c) {
        ans[1] = b;
        ans[2] = c;
      }else {
        ans[1] = c;
        ans[2] = b;
      }
    }else if(b <= a && b <= c) {
      ans[0] = b;
      if(a <= c) {
        ans[1] = a;
        ans[2] = c;
      }else {
        ans[1] = c;
        ans[2] = a;
      }
    }else if(c <= a && c <= b) {
      ans[0] = c;
      if(a <= b) {
        ans[1] = a;
        ans[2] = b;
      }else {
        ans[1] = b;
        ans[2] = a;
      }
    }

    System.out.println(ans[0] + " "+ ans[1] + " " + ans[2]);
  }

}
