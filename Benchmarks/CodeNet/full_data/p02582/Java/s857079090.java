import java.util.*;
public class Main {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='R') {
			k++;	
			}
		}
		if(s.charAt(1)=='S') {
			k--;	
			}
		System.out.println(k);

	}

}
