import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] c = s.toCharArray();
    boolean t = true;
    for(int i=0;i+1<s.length();i+=2){
      if (c[i] == 'L'){
        t = false;
        break;
      } else if (c[i+1] == 'R'){
        t = false;
        break;
      }
    }
    if(t == true){
      System.out.println("Yes");
    } else if (t == false){
      System.out.println("No");
    }
  }
}