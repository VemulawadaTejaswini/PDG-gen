import java.util.*;

public class Main {
	static final long MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		HashMap<Integer, String> dic = new HashMap<>();
		dic.put(0, "");
		
		for(int i=0; i<N; i++) {
			String s = sc.next();
			int L = s.length();
			for(int j=K-L; j>=0; j--) {
				if(dic.containsKey(j)) {
					String s1 = dic.get(j)+s;
					if(dic.containsKey(j+L)) {
						if(s1.compareTo(dic.get(j+L))<0)
							dic.put(j+L,s1);
					} else {
						dic.put(j+L,s1);
					}
				}
			}
		}
		
		System.out.println(dic.get(K));
		sc.close();
	}
	
}
