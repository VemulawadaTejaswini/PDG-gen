import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String inputStr = sc.nextLine();
		sc.close();
		
		ArrayList<int[]> zArrList = new ArrayList<>();
		for(int i = 1 ; i < inputStr.length(); i++) {
			zArrList.add(zAlgorithm(inputStr.substring(i)));
		}
		
		int maxLen = 0;
		for(int i = 0; i < zArrList.size(); i++) {
			int[] intArr = zArrList.get(i);
			for(int j = 0; j < intArr.length; j++) {
				int zArrValue = intArr[j];
				if(zArrValue <= j && maxLen < zArrValue) {
					maxLen = zArrValue;
				}
			}
		}
		
		System.out.println(maxLen);
	}
	
	public static int[] zAlgorithm(String str) {
		
		int n = str.length();
		int[] zArr = new int[n];
		int L,R,k;
		
		L = R = 0;
		for(int i = 1; i < n;i++) {
			if(i > R) {
				L = R = i;
				while(R < n && str.charAt(R - L) == str.charAt(R)) {
					R++;
				}
				zArr[i] = R - L;
				R--;
			}else {
				k = i - L;
				if(zArr[k] < R - i +1) {
					zArr[i] = zArr[k];
				}else {
					L = i;
					while(R < n && str.charAt(R - L) == str.charAt(R)) {
						R++;
					}
					zArr[i] = R - L;
					R--;
				}
			}
		}
		
		return zArr;
	}
}
