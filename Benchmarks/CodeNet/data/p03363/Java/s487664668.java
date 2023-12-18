import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String s = sc.nextLine();
		String[] inputList = s.split(" ");

		int ans = 0;
		for (int i=0; i<n; i++) {
			int sum = 0;
			for(int l=i; l<n; l++) {
				sum += Integer.parseInt(inputList[l]);
				if (sum == 0) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}