import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] line = parseIntArray(sc.nextLine());
//		int aSpeceis = line[0];
//		int bSpeceis = line[1];
		int m = line[2];
		int[] aPrices = parseIntArray(sc.nextLine());
		int[] bPrices = parseIntArray(sc.nextLine());
		
		int[][] discount = new int[m][3];
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
		for(int i: aPrices) {
			if(minA > i) {
				minA = i;
			}
		}
		for(int i: bPrices) {
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
	
	private static int[] parseIntArray(String line) {
		String[] arr = line.split(" ");
		int [] intArr = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			intArr[i] = Integer.parseInt(arr[i]);
		}
		return intArr;
	}
}