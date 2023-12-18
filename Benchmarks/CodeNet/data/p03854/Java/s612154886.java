import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String S = sc.nextLine();
    StringBuffer sb = new StringBuffer(S);
    S = sb.reverse().toString();
    while(S.length() >= 5){
      if(S.substring(0,5).equals("maerd")){
        S = S.substring(5, S.length());
      }else if(S.substring(0,5).equals("esare")){
        S = S.substring(5, S.length());
      }else if(S.substring(0,6).equals("resare")){
        S = S.substring(6, S.length());
      }else if(S.substring(0,7).equals("remaerd")){
        S = S.substring(7, S.length());
      }else{
        break;
      }
    }
    
    String ans = "";
    if(S.length() == 0){
      ans = "YES";
    }else{
      ans = "NO";
    }
    System.out.println(ans);
  }
}