import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b=sc.nextInt();
		String s = sc.next();
		boolean hasHyphen=false;
		for(int i=0;i<s.length()+1;i++) {
			if(s.charAt(i)=='-') {
				if(hasHyphen) {
					System.out.println("No");
				}else {
					hasHyphen=true;
				}
			}
		}
		System.out.println("Yes");
		
	}
}
