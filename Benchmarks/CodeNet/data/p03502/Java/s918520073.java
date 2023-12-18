import java.util.*;

public class Main{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    String arrayN = String.valueOf(n);
    String[] box  = arrayN.split("");
    for (String box1 : box) {
      sum += Integer.parseInt(box1);
    }
    if(n%sum == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}