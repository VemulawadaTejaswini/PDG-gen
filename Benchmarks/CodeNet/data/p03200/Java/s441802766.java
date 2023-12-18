import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] S = sc.next().split("");
		long count = 0;
		while (true) {
			boolean key = true;
			for (int i = 0; i < S.length-1; i++) {
				if (S[i].equals("B") && S[i+1].equals("W")) {
					S[i] = "W";
					S[i+1] = "B";
					count++;
					key = false;
					break;
				} 
			}
			if (key) break;
		}
		System.out.println(count);
	}
}