import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        if((s1.substring(s1.length() - 1).equals(s2.substring(0,1))) && (s2.substring(s2.length() - 1)).equals(s3.substring(0,1))){
        	System.out.println("YES");
        }else{
        	System.out.println("NO");
        }
    }
}