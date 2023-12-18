import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    
    if(str.equals("[aiueo]")){
      System.out.println("vowel");
    }else{
      System.out.println("consonant");
  	}
  }
}