

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);

			int n = scanner.nextInt();
			scanner.nextLine(); //次の行へ

			int[] p = new int[n+1];
			int i = 1;
			while (scanner.hasNext()) {
				p[i] = scanner.nextInt();
				i++;
			}

			Main swap = new Main();
			if(swap.swap(p)) {
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}

			scanner.close();

		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("整数を入力してください");
		}
	}


	public Boolean swap(int[] p) {
		int count = 0;

		for(int i = 1; i < p.length; i++) {
			//i番目の数字がiでは無い
			if(p[i] != i) {
				//iと（i番目の数字）番目の数字が一致
				if(i == p[p[i]]) {
					if(count < 2) {		//2回目まで
						 count++;
					}else{				//2回目以降
						return false;
					}
				}else{
					return false;
				}
			}
		}

		return true;
	}

}

