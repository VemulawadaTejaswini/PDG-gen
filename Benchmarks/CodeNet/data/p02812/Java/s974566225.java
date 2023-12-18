
import java.util.Scanner;
//
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		int n=sc.nextInt();
		String s =sc.next();
		char[] array = s.toCharArray();
		int ans =0;
		
		for (int i=0;i<(n-2);i++) {
			StringBuilder buf = new StringBuilder();
			buf.append(array[i]);
			buf.append(array[i+1]);
			buf.append(array[i+2]);
			String st =buf.toString();
			if (st.equals("ABC")) {
				ans ++;
			}
		}
		System.out.println(ans);
		
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	}
	//----------------------------------------
	//置き場
	
	//----------------------------------------
}