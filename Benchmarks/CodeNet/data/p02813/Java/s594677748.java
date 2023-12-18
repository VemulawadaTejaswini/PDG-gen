import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		int[] q = new int[n];
		int[] array = new int[n];
		for (int i = 0; i < p.length; i++) {
			p[i] = sc.nextInt();
		}
		for (int i = 0; i < q.length; i++) {
			q[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		int num = 0;
		int pNum = -1;
		int qNum = -1;
		do {
			num++;
			if (Arrays.equals(array, p)) {
				pNum = num;
			} 
			
			if (Arrays.equals(array, q)) {
				qNum = num;
			}
		} while (nextPermutation(array));
		System.out.println(Math.abs(pNum - qNum));
		sc.close();
	}
 
	//順列全列挙
	//nが10を超えてくると間に合わなくなる
	static boolean nextPermutation(int[] array) {
		// Find longest non-increasing suffix
		int i = array.length - 1;
		while (i > 0 && array[i - 1] >= array[i])
			i--;
		// Now i is the head index of the suffix
 
		// Are we at the last permutation already?
		if (i <= 0)
			return false;
 
		// Let array[i - 1] be the pivot
		// Find rightmost element that exceeds the pivot
		int j = array.length - 1;
		while (array[j] <= array[i - 1])
			j--;
		// Now the value array[j] will become the new pivot
		// Assertion: j >= i
 
		// Swap the pivot with j
		int temp = array[i - 1];
		array[i - 1] = array[j];
		array[j] = temp;
 
		// Reverse the suffix
		j = array.length - 1;
		while (i < j) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
 
		// Successfully computed the next permutation
		return true;
	}
}