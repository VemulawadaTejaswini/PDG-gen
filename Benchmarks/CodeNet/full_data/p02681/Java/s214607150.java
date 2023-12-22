import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
      	String s = scn.next();
      	String t = scn.next();
      	if(s.length() == t.length() - 1){
        	if(s.equals(t.substring(0, s.length()))){
            	System.out.println("Yes");
            }else{
            	System.out.println("No");
            }
        }else{
        	System.out.println("No");
        }
	}
}