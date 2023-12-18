import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long k = sc.nextLong();

		int length = s.length();
		int ans = 0;

		for(int i=0; i<length; i++){
			ans = (int)s.charAt(i) - 48;
			k = k - (long)Math.pow((double)ans, 5000000000000L);
			if(k<0){
				break;
			}
		}

		System.out.println(ans);
	}
}