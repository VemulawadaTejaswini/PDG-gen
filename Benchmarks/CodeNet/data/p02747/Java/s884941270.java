import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    if(s.contains("hi") && !s.contains("hii") && !s.contains("hhi")){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    
  }
}
