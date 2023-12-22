import java.util.*;
public class Main{
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
    	String s = sc.nextLine();
      String s1 = sc.nextLine();
      
      int count =0;
      for(int i=0;i<s.length();i++){
      	if(s.charAt(i)!=s1.charAt(i)){
          
          count++;
        }
        
      }
      System.out.println(res);
      
    }
}
