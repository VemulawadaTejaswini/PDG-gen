
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int guest = scan.nextInt();
		int n = scan.nextInt();
		
		int[] power = new int[guest];
		for (int i = 0; i < power.length; i++) {
			power[i] = scan.nextInt();
		}
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < power.length; i++) {
			for (int j = 0; j < power.length; j++) {
				list.add(power[i] + power[j]);
			}
		}
		
		Collections.sort(list, Collections.reverseOrder());
		
		int sum = 0;
		int cnt = 0;
		for (Integer integer : list) {
			sum += integer;
			cnt++;
			if (cnt == n) {
				break;
			}
		}
		
		System.out.println(sum);
		
		
	}
}