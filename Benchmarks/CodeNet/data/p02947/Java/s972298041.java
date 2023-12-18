import java.util.Scanner;

public class Main {
	static String sort(String s){
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String nu = sc.nextLine();
		String S[] = new String[N];
		for(int i = 0; i < N;i++) {
			S[i]=sort(sc.nextLine());
		}
		int ans = 0;

		for(int i=0;i<N-1;i++) {
			for(int j = i+1; j<N;j++) {
				if(S[i].equals(S[j])) {
					ans++;
				}
			}
		}

		System.out.println(ans);
	}

}