import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(), Q = s.nextInt();
		String S = s.next();
		int[] Golem = new int[N + 2];
		Golem[0] = 0;
		Golem[N + 1] = 0;
		String[] Panel = new String [N + 2];
		Panel[0] = "";
		Panel[N + 1] = "";
		for (int i = 1; i <= N; i++){
			Golem[i] = 1; // パネルiのゴーレムの数(1<=i<=N)
			Panel[i] = S.substring(i - 1, i); // パネルiの文字
		}
		for (int j = 0; j < Q; j++){
			String t = s.next(), d = s.next();
			if (d.equals("L")){
				for (int k = 1; k <= N; k++){
					if (Panel[k].equals(t)){
						Golem[k - 1] += Golem[k];
						Golem[k] = 0;
					}
				}
			}
			else {
				for (int k = N; k >= 1; k--){
					if (Panel[k].equals(t)){
						Golem[k + 1] += Golem[k];
						Golem[k] = 0;
					}
				}
			}
		}
		int n = 0;
		for (int l = 1; l <= N; l++){
			n += Golem[l];
		} 
		System.out.println(n);
	}
}