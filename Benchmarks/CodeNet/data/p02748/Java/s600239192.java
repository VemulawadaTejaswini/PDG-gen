import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

import sun.util.resources.Bundles;

public class Main {
	public static void main(String[] args){
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
//		Scanner sc = new Scanner(System.in);
		int[] line = parseIntArray(br.readLine());
//		int aSpeceis = line[0];
//		int bSpeceis = line[1];
		int m = line[2];
		int[] aPrices = parseIntArray(br.readLine());
		int[] bPrices = parseIntArray(br.readLine());
		
		int[][] discount = new int[m][3];
		for(int i=0;i<m;i++) {
			String d = br.readLine();
			discount[i] = parseIntArray(d);
		}
		br.close();
		
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