

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int p = sc.nextInt();
		char[] input = sc.next().toCharArray();

		//debug
//		String str = new String(input);
//		for(int i = 0; i < n; i++){
//			for(int j = i + 1; j < n; j++){
//				long tmp = Long.parseLong(str.substring(i, j));
//
//				if(tmp % p == 0){
//					System.out.println("TEST "+tmp);
//				}
//			}
//		}


		int times = 1;
//		int K = 1;
		long result = 0;
//		boolean first = true;

		boolean checked[] = new boolean[n];
		for(int k = 0; k < n ; k++){

			long count = 0;
			for(int i = n - 1 - k; i >=  0; i--){
				if(checked[i]){
					break;
				}

				long tmp = 0;
				times = 1;
				for(int j = i; j >= 0; j--){
					tmp += (input[j] - '0') * times;

					if(tmp % p == 0){
						//debug
//						System.out.println("detect "+tmp);
//						if(first){
//							first = false;
//							K = i - j + 1;
//							System.out.println("K update "+K);
//						}
						checked[i] = true;
						i = j;
						count++;


						break;
					}

					times *= 10;
					times %= p;
				}
			}
//			System.out.println("count "+count);

			result += (long)count*(count + 1)/2;
		}



		System.out.println(result);
	}
}
