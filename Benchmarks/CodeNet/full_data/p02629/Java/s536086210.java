import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    Long N = sc.nextLong();
    
    String name = "";
    
    while(N>0){
      N = N-1;
      String x = String.valueOf(Character.toChars((int)(N%26)+97));
      name = x.concat(name);
      if(N >=26){
        N = (Long)N/26;
      } else {
        break;
      }
    }
    System.out.println(name);
  }
}