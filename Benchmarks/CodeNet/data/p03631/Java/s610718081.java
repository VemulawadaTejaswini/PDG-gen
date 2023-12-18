import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next().split("");
    System.out.println(a[0].equals(a[2]) ? "Yes" : "No");
  }
}
