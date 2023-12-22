import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lengthFirst = scanner.nextInt();
		int lengthSecond = scanner.nextInt();
		int maximum = scanner.nextInt();
		int[] books1 = new int[lengthFirst];
		int[] books2 = new int[lengthSecond];
		
		for(int i = 0; i < lengthFirst; i++)
			books1[i] = scanner.nextInt();
		for(int i = 0; i < lengthSecond; i++)
			books2[i] = scanner.nextInt();
		
		long[] sum = new long[lengthFirst];
		sum[0] = books1[0];
		int nums1 = 0;
		
		for(int i = 1; i < lengthFirst; i++) {
			sum[i] = sum[i - 1] + books1[i];
			if(sum[i] > maximum)
				break;
			nums1++;
		}
		long[] sum2 = new long[lengthSecond];
		sum2[0] = books2[0];
		int nums2 = 0;
		for(int i = 1; i < lengthSecond; i++) {
			sum2[i] = sum2[i - 1] + books2[i];
			if(sum2[i] > maximum)
				break;
			nums2++;
		}
		int result = Math.max(nums2 + 1, nums1 + 1);
		for(int i = 0; i <= nums1; i++) {
			for(int j = 0; j <= nums2; j++) {
				if(sum[i] + sum2[j] <= maximum) {
					result = Math.max(result, i + j + 2);
				}
				else
					break;
			}
		}
		
		System.out.println(result);
	}

}
