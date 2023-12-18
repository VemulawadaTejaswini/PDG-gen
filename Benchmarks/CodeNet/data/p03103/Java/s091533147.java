import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int tmp[] = convertStringToArrayInt(input);
		int N = tmp[0];
		int M = tmp[1];

		Map<Integer, Integer> dataMap = new TreeMap<Integer, Integer>();
		for(int i = 0; i < N; i ++) {
			input = sc.nextLine();
			int tmpInput[] = convertStringToArrayInt(input);
			dataMap.put(tmpInput[0], tmpInput[1]);
		}
	
		long amount = 0;
		
		for(Map.Entry<Integer, Integer> entry : dataMap.entrySet()) {
			if(M - (entry.getValue()) >= 0) {
				M = M -entry.getValue();
				amount = (long)amount +((long)entry.getKey()*(long)entry.getValue());
			}else {
				for(int i = 0; i < M ; i++) {
					amount = amount + entry.getKey();
				}
				break;
			}
		}
	    System.out.println(amount);
		sc.close();
	}
	

	private static int[] convertStringToArrayInt(String input) {
		return Arrays.stream(input.split(" ")).filter(s -> !s.isEmpty()).mapToInt(Integer::parseInt).toArray();
	}
}