import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    String str2 = sc.next();
	String ans = "No";
    for(int i = 0;i < str1.length();i++){
      if(str1.equals(str2)){
        ans="Yes";
      }
    }
    System.out.println(ans);
  }
}