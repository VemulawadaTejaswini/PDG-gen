import java.util.*;
public class Main{
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
    	String s = sc.nextLine();
      String s1 = sc.nextLine();
      String res = "";
      int count =0;
      for(int i=0;i<s.length();i++){
      	if(s.charAt(i)!=s1.charAt(i)){
          res+=s.charAt(i);
          count++;
        }
        else{
       		res+=s.charAt(i); 
        }
      }
      System.out.println(res);
      
    }
}