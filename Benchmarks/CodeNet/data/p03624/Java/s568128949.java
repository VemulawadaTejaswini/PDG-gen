import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    for(char c = 'a';c <= 'z';c++){
      String cc = String.valueOf(c);
      String scp = s.replace(cc,"");
      if(s.length() == scp.length()){
        System.out.println(c);
        return;
      }
    }
    System.out.println("None");
  }
}
