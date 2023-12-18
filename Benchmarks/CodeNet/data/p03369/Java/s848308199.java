import java.util.*;

public class Something {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int value=700;
		String something=sc.next();
		
		for(int i=0;i<something.length();i++) {
			if(something.charAt(i)=='o'){
				value+=100;
			}
		}
		System.out.println(value);
		sc.close();
	}
}