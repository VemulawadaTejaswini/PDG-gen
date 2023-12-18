import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    
    int cnt = 0;
    String str = null;
    str = sn.nextLine();
    
    char[] c = str.toCharArray();
    
    if(c[2] == c[3]) {
      cnt++;
    } else {
      System.out.print("No");
      return;
    }
       
    if(c[4] == c[5]) {
      cnt++;
    } else {
      System.out.print("No");
      return;
    }
    
    if(cnt == 2) {
		System.out.print("Yes");
    }
  }
}