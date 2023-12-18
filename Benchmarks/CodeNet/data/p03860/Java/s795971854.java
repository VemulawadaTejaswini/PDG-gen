import java.util.*;

class Main{
  
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    sc.close();
    String ans = "A";
    sc = new Scanner(s);
    String tmp = "";
    for(int i = 0; i < 2; ++i){
      tmp = sc.next();
    }
    sc.close();
    ans += tmp.charAt(0) + "C";
    System.out.println(ans);
  }
}
