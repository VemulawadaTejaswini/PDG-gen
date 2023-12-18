import java.util.*;


public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    boolean result = false;

    if(Math.abs(a - c) <= d){
      result = true;
    }
    if(Math.abs(a - b) <= d && Math.abs(b - c) <= d ){
      result = true;
    }

    System.out.println(result ? "Yes" : "No");

  }
}
