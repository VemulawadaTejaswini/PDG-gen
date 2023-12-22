import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long result = 0;
		long modVal =  10*10*10*10*10*10*10*10*10 + 7;
		
		List<Long> aArray = new ArrayList<>();
		for (int i = 0; i<n; i++) {
			long aj = Long.parseLong(sc.next());
			for (long ai : aArray) {
				result += ai*aj;
				if (modVal < result) {
					result = result % modVal;
				}
			}
			aArray.add(aj);
		}		
		System.out.println(result);
	}	

}
