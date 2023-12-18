import java.util.*;
class Main {
  public static void main (String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    
    String s=sc.next();
    int ans =0;
    
    for(int i=0; i<s.length(); i++){
      char c =s.charAt(i);
      if (c=='2')ans++;
      }
    
    System.out.println(ans);

  }
}