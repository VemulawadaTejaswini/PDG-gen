import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		List<String> inputList = new ArrayList<>();

		for(int i = 0; i < n;i++) {
			char c[] = sc.nextLine().toCharArray();
			Arrays.sort(c);
			inputList.add(new String(c));
		}

		Collections.sort(inputList);
		long result = 0;

		long cnt = 0;
		for(int i = 1;i < n;i++) {
			if(inputList.get(i).equals(inputList.get(i - 1))) {
				cnt++;
			}else {
				result +=((cnt * (cnt + 1)) / 2);
				cnt = 0;
			}
		}

		if(cnt >= 1) {
			result +=((cnt * (cnt + 1)) / 2);
		}

		System.out.println(result);
	}
}
