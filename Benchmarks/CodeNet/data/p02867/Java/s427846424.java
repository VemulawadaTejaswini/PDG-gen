import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];

		for(int i = 0; i < A.length; i++) {
			String str = sc.next();
			A[i] = Integer.parseInt(str);
		}

		for(int i = 0; i < B.length; i++) {
			String str = sc.next();
			B[i] = Integer.parseInt(str);
		}

		for(int i = 0; i < A.length - 1; i++) {
			for(int j = i + 1; j < A.length; j++) {
				if(A[i] < A[j]) {
					int tmp = A[i];
					A[i] = A[j];
					A[j] = tmp;

					tmp = B[i];
					B[i] = B[j];
					B[j] = tmp;
				}
			}
		}

//		for(int i = 0; i < A.length; i++) {
//			System.out.println(B[i]);
//		}

		boolean flag = false;
		int counter = 0;

		for(int i = 0; i < B.length - 1; i++) {
			flag = false;
			for(int j = i + 1; j < B.length; j++) {
				if(B[i] < B[j]) {
					flag = true;
					int tmp = B[j];
					B[j] = B[i];
					B[i] = tmp;
				}
				else {
				}
			}
			if(flag) {
				counter++;
			}else {

			}
		}

		boolean flag2= true;
		for(int i = 0; i < A.length; i++) {
			if(A[i] <= B[i]) {

			}else {
				flag2 = false;
				break;
			}
		}

		if(flag2 && counter <= N - 2) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}