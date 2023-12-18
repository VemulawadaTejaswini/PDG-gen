import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
      	String s=sc.nextLine();
      	char[] str=s.toCharArray();
      	if(str.length<6){
        	System.out.println("No");
        }
      	else{
	      	if(str[3]==str[4] && str[5]==str[6]){
    	    	System.out.print("Yes");
        	}
          	else{
            	System.out.println("No");
            }
        }
    }
}