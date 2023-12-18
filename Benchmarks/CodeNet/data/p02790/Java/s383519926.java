import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String[] s = new String[2];
		Arrays.fill(s, "");
		for(int i=0;i<b;i++) {
			s[0]+=a;
		}
		
		for(int i=0;i<a;i++) {
			s[1]+=b;
		}
		
		Arrays.sort(s);
		
		System.out.println(s[0]);

	}

}
