import java.util.*;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
      	String S = sc.next();
      	String[] ary = S.split("", 0);
      	int count = 0;
      
      	for(int i = 0; i < ary.length; i++) {
        	if(ary[i].equals("+")) {
            	count++;
            } else {
             	count--; 
            }
        }
      	System.out.println(count);
    }
}