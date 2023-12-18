import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 0;
		HashMap<String,Integer> sk = new HashMap<String,Integer>();
		for(int i=0;i<n;i++) {
			String s = sc.next();
			String[] po = s.split(""); 
			Arrays.sort(po);
			s =String.join("",po);
			if(sk.containsKey(s)) {
				sk.put(s, sk.get(s)+1);
			}else {
				sk.put(s, 1);
			}
		}
		for(int i:sk.values()) {
			ans+= (i-1)*(i)/2;
		}
		System.out.println(ans);
	}
}