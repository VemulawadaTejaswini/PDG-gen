import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] S = s.split("/");
		int[] N = new int[3];
		for(int i = 0; i < 3; i++) {
			N[i] = Integer.parseInt(S[i]);
		}
		String ans = "Heisei";
		if(N[0] >= 2019 && N[1] >= 5) {
			ans = "TBD";
		}
		System.out.println(ans);
		sc.close();
	}
	
}
