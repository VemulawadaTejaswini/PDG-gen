import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] S=sc.next().split("");
		int ans=0;

		for(int i=0;i<S.length/2;i++) {
			if(!(S[i].equals(S[S.length-(i+1)]))) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}