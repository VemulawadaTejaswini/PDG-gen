import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S  = sc.nextLine();
    boolean check = true;
    while(check){
      if(S.indexOf("ST") != -1){
        S = S.replace("ST", "");
      }else{
        check = false;
      }
    }
    System.out.println(S.length());
  }
}
