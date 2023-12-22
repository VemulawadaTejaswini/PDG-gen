import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	String str = sc.next();
     	String ans = "";
      
      for(int i = 0; i < 3; i++){
      	ans += str.charAt(i);
      }  
      
      System.out.println(ans);
    } 
}