import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] itemList = new String[n];

		for(int i = 0;i < n;i++) {
			itemList[i] = sc.next();
		}
		Arrays.sort(itemList);
		int answer = 1;
		for(int i = 1;i < n;i++) {
			if(!itemList[i].equals(itemList[i -1])) {
				answer++;
			}
		}
		System.out.println(answer);



	}
}