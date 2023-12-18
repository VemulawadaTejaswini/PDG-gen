import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		boolean[] hate = new boolean[10];
		for(int i=0; i<K; i++)
			hate[sc.nextInt()]=true;
		
		for(int i=N; i<=10000; i++) {
			boolean ok = true;
			String str = String.valueOf(i);
			for(int j=0; j<str.length(); j++) {
				if(hate[str.charAt(j)-'0']) {
					ok = false;
					break;
				}
			}
			if(ok) {
				System.out.println(i);
				break;
			}
		}
		
		sc.close();
	}
}
