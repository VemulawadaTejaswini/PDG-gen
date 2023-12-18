import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		StringBuffer str = new StringBuffer(S);

		if (!str.equals(str.reverse())) {
			System.out.println("No");
		} else {
			StringBuffer str3 = new StringBuffer(S.substring(0,(S.length()-1)/2));
			if (!str3.equals(str3.reverse())) {
				System.out.println("No");
			} else {
				StringBuffer str2 = new StringBuffer(S.substring((S.length()+3)/2-1, S.length()));
				if (!str2.equals(str2.reverse())) {
					System.out.println("No");
				} else {
					System.out.println("Yes");
				}
			}
		}
		
		sc.close();
    }	
		
}