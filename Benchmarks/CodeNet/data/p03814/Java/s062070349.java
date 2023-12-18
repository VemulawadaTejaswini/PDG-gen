import java.util.*;
 
public class Main{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
    	String s = sc.next();
        int a;
        int z;
        for(int i = 0; i < s.length(); i++){
        	if(s.charAt(i) == 'A'){
            	a = i;
                break;
            }
        }
        for(int i = 0; i < s.length(); i++){
        	if(s.charAt(i) == 'Z'){
            	z = i + 1; 
            }
        }
        System.out.println(z - a);
	}
}