
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int n;
		int m;
		String id_str;

		int[] a = new int[10];
		int[] dp = new int[10];
		int[] dp_temp = new int[10];

		Arrays.fill(dp, 0);
		dp[0] = 1;
		Arrays.fill(dp_temp, 0);

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		id_str = sc.next();
		m = sc.nextInt();
		for(int i=0; i<m; i++) a[i] = sc.nextInt();

		sc.close();

		char[] id_char = new char[n];
		id_char = id_str.toCharArray();


		for(int i=0; i<n; i++){
			Arrays.fill(dp_temp, 0);

//			for(int k=0; k<10; k++){
//				System.out.println(dp[k]);
//
//			}
//			System.out.println("------------------------------");

			if(id_char[n-1-i] == '*'){
				for(int j=0; j<m; j++){
					if(i%2==0){
						for(int k=0; k<10; k++){
							dp_temp[(k+a[j])%10] += dp[k];
						}
					}else{
						for(int k=0; k<10; k++){
							dp_temp[(k+a[j]*2-9*(a[j]/5))%10] += dp[k];
						}

					}
//					for(int k=0; k<10; k++){
//					System.out.println(dp_temp[k]);
//
//				}
//				System.out.println("------------------------------");
				}

			}else{

				if(i%2==0){
					for(int k=0; k<10; k++){

//						System.out.println(id_char[n-1-i]);
//						System.out.println(dp[k]);

						dp_temp[(k+(id_char[n-1-i]-'0'))%10] = dp[k];
					}
				}else{
					for(int k=0; k<10; k++){
						dp_temp[(k+(id_char[n-1-i]-'0')*2-9*((id_char[n-1-i]-'0')/5))%10] = dp[k];
						//System.out.println(((id_char[n-1-i]-'0')*2-9*((id_char[n-1-i]-'0')/5))%10);
					}
//					for(int k=0; k<10; k++){
//						System.out.println(dp_temp[k]);
//
//					}
//					System.out.println("------------------------------");
				}

			}
			for(int k=0; k<10; k++){
				dp[k] = dp_temp[k];
			}

		}

		System.out.println(dp[0]);

	}

}