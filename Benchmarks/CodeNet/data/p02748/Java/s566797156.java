import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Integer[] line = parseIntArray(sc.nextLine());
		int aSpeceis = line[0];
		int bSpeceis = line[1];
		int m = line[2];
		Integer[] aPrices = parseIntArray(sc.nextLine());
		Integer[] bPrices = parseIntArray(sc.nextLine());
		
		Integer[][] discount = new Integer[m][3];
		for(int i=0;i<m;i++) {
			String d = sc.nextLine();
			discount[i] = parseIntArray(d);
		}
		sc.close();
		
		List<Integer> payment = new ArrayList<Integer>();
		for(int i=0;i<m;i++) {
			payment.add(aPrices[discount[i][0]-1]+bPrices[discount[i][1]-1]-discount[i][2]);
		}
		// 割引なしの合計最安
		int minA = 100000;
		int minB = 100000;
		for(Integer i: aPrices) {
			if(minA > i) {
				minA = i;
			}
		}
		for(Integer i: bPrices) {
			if(minB > i) {
				minB = i;
			}
		}
		payment.add(minA+minB);
		
		int minPayment = 200000;
		for(Integer i: payment) {
			if(minPayment > i) {
				minPayment = i;
			}
		}
		
		System.out.print(minPayment);
	}
	
	private static Integer[] parseIntArray(String line) {
		String[] arr = line.split(" ");
		Integer [] intArr = new Integer[arr.length];
		for(int i=0;i<arr.length;i++) {
			intArr[i] = Integer.parseInt(arr[i]);
		}
		return intArr;
	}
}