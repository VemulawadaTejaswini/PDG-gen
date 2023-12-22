import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.substring(s.length() - 1);
        if(s.equals("3")){
        	System.out.println("bon");
        }else if(s.equals("0") || s.equals("1") || s.equals("6") || s.equals("8")){
        	System.out.println("pon");
        }else{
        	System.out.println("hon");
        }
    }
}