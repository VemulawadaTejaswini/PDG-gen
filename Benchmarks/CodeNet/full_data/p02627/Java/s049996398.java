import java.util.*;

public static void main(String[] args){
 	Scanner sc = new Scanner(System.in);
  	String str = sc.next();
  	char c = str.charAt(0);
  	if(Character.isUpperCase(c)){
    	System.out.println("A");
    }else{
      System.out.println("a");
    }
}