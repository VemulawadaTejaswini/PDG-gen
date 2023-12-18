import java.util.*;
public class Main { 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		String s = sc.next();
		String ans = "No";
		
		if(n % 2 == 0) {
			if(s.substring(0,s.length()/2).equals(s.substring(s.length()/2))) {
				ans = "Yes";
			}
		}
		System.out.println(ans);
	}	
}