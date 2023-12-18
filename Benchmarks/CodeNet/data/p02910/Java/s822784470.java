import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String dance = sc.next();
    boolean flg = true;
    
	for(int i = 0; i < dance.length(); i++){
      char c = dance.charAt(i);
      if((i + 1) % 2 == 0){
        if(c != 'L' && c != 'U' && c != 'D'){
         flg = false;
         break;
        }
      }else{
        if(c != 'R' && c != 'U' && c != 'D'){
         flg = false;
         break;
        }
      }
    }
    if(flg){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}