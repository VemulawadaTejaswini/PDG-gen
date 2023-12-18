import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String a = scan.next();
    String b = scan.next();
    for (int i=0;i<n;i++){
      System.out.print(a.charAt(i));
      System.out.print(b.charAt(i));
    }
    System.out.println();
  }
}
