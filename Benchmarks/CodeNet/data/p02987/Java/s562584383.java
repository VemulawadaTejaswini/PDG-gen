import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		boolean ok = true;
		if(S[0] == S[1] && S[1] == S[2] && S[2] == S[3])
			ok = false;
		int[] Snum = new int[4];
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(S[i] == S[j])
					Snum[i]++;
			}
		}
		for(int i = 0; i < 4; i++)
			if(Snum[i] != 2)
				ok = false;
		System.out.println(ok ? "Yes" : "No");

	}

}
