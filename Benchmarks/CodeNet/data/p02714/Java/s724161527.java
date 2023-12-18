import java.util.Scanner;


public class Main {


	final int MOD = 1000000007;


	public static void main(String[] args) {

		long ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

		int n = sc.nextInt();
//		int k = sc.nextInt();
		String string = sc.next();
		String[] strArray = string.split("");

		//-------------------------------------------------------------------------------------

		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(strArray[i].equals(strArray[j])) {
					continue;
				}
				for(int l = j+1; l < n; l++) {
					if(strArray[i].equals(strArray[l]) || strArray[j].equals(strArray[l])) {
						continue;
					}
					if(j - i == l - j) {
						continue;
					}
					ans++;
				}
			}
		}


		//-------------------------------------------------------------------------------------

//		if(f) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

		System.out.println(ans);

		sc.close();
	}
}