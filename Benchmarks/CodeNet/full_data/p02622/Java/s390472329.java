import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		char[] T = sc.next().toCharArray();
		sc.close();
		int i=0;
		int ans = 0;
		while(!Arrays.equals(S, T)){
			if(T[i]!=S[i]){
				S[i]=T[i];
				ans++;
			}
			i++;
		}
		System.out.println(ans);
	}
}
