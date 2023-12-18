import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] firstLineArr = sc.nextLine().split(" ");
		String[] secondLineArr = sc.nextLine().split(" ");
		sc.close();
		int n = Integer.parseInt(firstLineArr[0]);
		int k = Integer.parseInt(firstLineArr[1]);
		int[] sequenceArr = new int[n];
		
		for(int i = 0; i < n ;i++) {
			sequenceArr[i] = Integer.parseInt(secondLineArr[i]);
		}
		
		boolean beforeSmallestEqualLeft = false;
		int beforeLargest = n+1;
		int sequenceValiation = 0;
		int sortCnt = 0;
		
		for(int i = 0; i < n - k + 1;i++) {
			
			int start = i;
			int end = i + k - 1;
			
			if(beforeSmallestEqualLeft && sequenceArr[end] > beforeLargest) {
				int minValue = getMinimamValue(sequenceArr,start,end);
				if(minValue == sequenceArr[start]) {
					beforeSmallestEqualLeft = true;
				}else {
					beforeSmallestEqualLeft = false;
				}
				beforeLargest = sequenceArr[end];
				continue;
			}
			
			if(isSorted(sequenceArr,start,end)) {
				beforeSmallestEqualLeft = true;
				beforeLargest = sequenceArr[end];
				sortCnt = 1;
				continue;
			}
			
			sequenceValiation++;
			int minValue = getMinimamValue(sequenceArr,start,end);
			if(sequenceArr[end] > beforeLargest) {
				beforeLargest = sequenceArr[end];
			}else {
				beforeLargest = getMaxmamValue(sequenceArr,start,end);
			}
			if(minValue == sequenceArr[start]) {
				beforeSmallestEqualLeft = true;
			}else {
				beforeSmallestEqualLeft = false;
			}	
		}
		System.out.println(sequenceValiation+sortCnt);
	}
	
	public static boolean isSorted(int[] intArr, int start, int end) {
		
		for(int i = start; i < end;i++) {
			if(intArr[i] > intArr[i + 1]) {
				return false;
			}
		}
		return true;
	}
	
	public static int getMinimamValue(int[] intArr, int start, int end) {
		int minimamValue = intArr[start];
		for(int i = start+1; i <= end;i++) {
			if(minimamValue > intArr[i]) {
				minimamValue = intArr[i];
			}
		}
		return minimamValue;
	}
	
	public static int getMaxmamValue(int[] intArr,int start ,int end) {
		int maxmamValue = intArr[start];
		for(int i = start+1; i <= end;i++) {
			if(maxmamValue < intArr[i]) {
				maxmamValue = intArr[i];
			}
		}
		return maxmamValue;
	}
}
