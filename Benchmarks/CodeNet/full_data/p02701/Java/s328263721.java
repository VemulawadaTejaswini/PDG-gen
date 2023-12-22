import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> itemList = new ArrayList<String>();
		int answer = 0;
		for(int i = 0;i < n;i++) {
			String item = sc.next();
			if(itemList.indexOf(item) == -1) {
				answer++;
				itemList.add(item);
			}
		}
		System.out.println(answer);



	}
}