import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    String name = "";
    
    while(N>0){
      String x = String.valueOf(Character.toChars((N-1)%26+97));
      name = x.concat(name);
      if(N >26){
        N = (int)N/26;
      } else {
        break;
      }
    }
    System.out.println(name);
  }
}