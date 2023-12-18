import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		int count = 0;
		for(int i=0; i<n-1; i++){
			if(s.charAt(i) == s.charAt(i+1)){
				count++;
			}
		}
		int ans = Math.min(count+k*2, n-1);
		System.out.println(ans);
	}
}
