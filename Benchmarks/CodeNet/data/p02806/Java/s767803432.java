import java.util.Scanner;

public class Main {



	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	// 入力
	int n = sca.nextInt();
	String[] s = new String[n];
	int[] t = new int[n];
	for(int i = 0; i < n; i++) {
		s[i] = sca.next();
		t[i] = sca.nextInt();
	}
	int inemuri = 0;
	String x = sca.next();
	for(int i = 0; i < n; i++) {
		if(s[i].equals(x)  == true) {
			inemuri = i;
		}
	}
	int ans = 0;
	for(int i = inemuri + 1; i < n; i++) {
		ans = ans + t[i];
	}

	System.out.println(ans);

	// 後始末
	sca.close();
	}
}