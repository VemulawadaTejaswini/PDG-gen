import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =  Integer.parseInt(sc.nextLine());
		boolean flag = true;
		int ans = 0;
		String str = sc.nextLine();
		String[] temp = str.split(" ");
		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(temp[i]);
		}


		for(int j = 0; j < N; j++) {
			if((A[j] % 2 != 0) && (flag == true) ) {
				if(j == 0) {
					flag = false;
					break;
				}
				break;
			}
			for(int k = 0; k < N; k++) {
				A[k] = A[k]/2;
			}
			ans++;
		}
		if(flag == true) {
			System.out.println(ans);
		} else {
			System.out.println(0);
		}


	}

}
