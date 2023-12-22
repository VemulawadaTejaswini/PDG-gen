import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = "α";
    
    if(Character.isupperCase(str.charAt(0))){
      System.out.println("A");
    }else{
      System.out.println("a");
    }
  }
}