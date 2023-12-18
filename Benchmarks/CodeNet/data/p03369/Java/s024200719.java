import java.util.*;

public class Main {
  public static void main(String[] args) {
    
    int price = 700;
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    
    for(int i = 0;i < 3;i++){
      if(s.charAt(i) == 'o') price += 100;
    }
    
    System.out.println(price);
  }
}
