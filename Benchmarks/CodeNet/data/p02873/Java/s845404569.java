import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = sc.next().toCharArray();
		sc.close();

		int len = ch.length+1;
		int[] L = new int[len];
		int[] R = new int[len];
		for(int i = 1;i < len;i++) {
			if(ch[i-1]=='<') {
				L[i] = L[i-1] + 1;
			}
		}
		for(int i = len-2;i >= 0;i--) {
			if(ch[i]=='>') {
				R[i] = R[i+1] + 1;
			}
		}
		//System.out.println(Arrays.toString(L));
		//System.out.println(Arrays.toString(R));;
		long ans = 0;
		for(int i = 0;i < len;i++) {
			ans += Math.max(L[i], R[i]);
		}
		System.out.println(ans);
	}
}