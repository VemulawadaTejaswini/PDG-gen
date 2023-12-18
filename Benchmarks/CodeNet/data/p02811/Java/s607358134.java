import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    int x=sc.nextInt();
    if((500*k) < x) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
  }
}
