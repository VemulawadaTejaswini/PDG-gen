import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		ArrayList<String> arr = new ArrayList<>();
		long count = 0;
		sc.nextLine();
		for(int i = 0;i<input;i++) {
			char[] temp = sc.nextLine().toCharArray();
			Arrays.sort(temp);
			String out = new String(temp);
			arr.add(out.toString());
		}
		Collections.sort(arr);
		long dif = 0;
		int curr = 0;
		for(int i = 1;i<arr.size();i++) {
			if(!(arr.get(curr).equals(arr.get(i)))) {
				dif = i - curr;
				count += dif*(dif-1)/2;
				curr = i;
			}
		}
		dif = input-curr;
		count += dif*(dif-1)/2;
		System.out.println(count);
	}

}
