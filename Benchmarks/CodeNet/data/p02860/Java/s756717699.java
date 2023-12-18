import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		
		boolean val = true;
		
		if(s.length()%2!=0)
			val = false;
		else {
			for(int i=0;i<n/2;i++) {
				if(s.charAt(i)!=s.charAt(i+n/2)) {
					val = false;
					break;
				}
			}
		}
		
		System.out.println(val ? "Yes" : "No");
	}
}
