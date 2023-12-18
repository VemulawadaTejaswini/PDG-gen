import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());

		int[] A = new int[N+1];
		for(int i =1; i < N+1; i++) {
			A[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		int max = 0;
		for(int i = 1; i <A.length; i++) {
			max = Math.max(max, A[i]);
		}

		int[] numbers = new int[max + 1];
		for(int i = 1; i < A.length; i++) {
			numbers[A[i]]++;
		}

		int l1 = 0, l2 = 0;
		for(int i = numbers.length-1; i > 0; i-- ) {
			if(numbers[i] >= 4 && l1 == 0) {
				l1 = i;
				break;
			}else if(numbers[i] >= 2 && l1 == 0) {
				l1 = i;
			}else if(numbers[i] >= 2 && l1 != 0) {
				l2 = i;
				break;
			}
		}

		if(l1 != 0 && l2 != 0) {
			System.out.println(l1 * l2);
		}else if(l1 != 0 && l2 == 0) {
			System.out.println(l1 * l1);
		}else {
			System.out.println(0);
		}

	}

}
