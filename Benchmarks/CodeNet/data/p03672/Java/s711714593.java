import java.util.Scanner;

public class Main {

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			// スペース区切りの整数の入力
			String S = sc.next();

			String[] ar = S.split("");
			
			int len = S.length();
//			System.out.println("len = " + len);

			int j = 0;
			int k = 0;
			for (int i = len - 2 ; i > 0;i -- ){
				j = (i + 1) % 2;
				if ( j == 0){
					k = (i + 1) / 2;
//					System.out.println("k = " + k);
					
					int match = 0;
					for (int l = 0 ; l < k;l ++ ){
//						System.out.println("l　値     = " + l);
//						System.out.println("l     = " + ar[l]);
//						System.out.println("l + 1 = " + ar[l + k]);
						if(ar[l].equals(ar[l + k])  ){
						}else{
							match = 1;
							break;
						}
					}
					if (match == 0){
//						System.out.println("k ans = " + (i + 1));
						System.out.println(i + 1);
						return;
					}
					// 出力
//					System.out.println(j);
				}

			}
			System.out.println("end");

			
			  
			  
		}
}
