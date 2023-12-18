import java.util.*;

public class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
	String str = sc.next();
    if(str.charAt(3) == str.chatAt(4) && str.charAt(5) == str.chatAt(6)){
      System.out.println(Yes);
    }
    else{
      System.out.println(No);
    }
  }
}