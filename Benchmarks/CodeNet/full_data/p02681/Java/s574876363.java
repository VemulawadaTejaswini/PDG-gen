import java.util.*;

class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String S = sc.next();
      String T = sc.next();
      String result = "Yes";
      
      if(S.length()+1 != T.length()){
        result = "No";
      }
      if(!T.substring(0,S.length()).equals(S)){
        result = "No";
      }
      
      System.out.println(result);
    }
}