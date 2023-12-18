import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();

    for(int i=0 ; i<s.length() ; i++){
      if(i<s.length()-1){
        if(s.charAt(i)==t.charAt(i)){
          continue;
        }else{
          System.out.println("No");
          break;
        }
      }else{
        System.out.println("Yes");
      }
    }
  }
}
