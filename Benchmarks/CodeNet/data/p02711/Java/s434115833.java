import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        for(int i = 0; i < s.length(); i++){
        	if(s.charAt(i) == '7'){
            	System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
	}
}