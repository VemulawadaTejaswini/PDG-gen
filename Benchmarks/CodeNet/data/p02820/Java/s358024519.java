import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int R = sc.nextInt();
		int S = sc.nextInt();
		int P = sc.nextInt();
		String T = sc.next();
		String[] splitT = T.split("", 0);
		int score = 0;

		ArrayList<String> modT = new ArrayList<String>();
		for (int i = 0; i < K; i++) {
			for (int j = i; j < N; j += K) {
				modT.add(splitT[j]);
			}
			String remind = null;
			for (String mod : modT) {
				switch (mod) {
				case "s":
					if(mod.equals(remind)){
						remind +=" ";
						continue;
					}
					score += R;
					remind = mod;
					continue;
				case "p":
					if(mod.equals(remind)){
						remind +="a";
						continue;
					}
					score += S;
					remind = mod;
					continue;
				case "r":
					if(mod.equals(remind)){
						remind +=" ";
						continue;
					}
					score += P;
					remind = mod;
					continue;
				}
			}
			modT.clear();
		}

		System.out.println(score);
	}
}
