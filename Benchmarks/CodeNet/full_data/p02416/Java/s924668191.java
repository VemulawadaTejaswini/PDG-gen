import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		for(;;){
			Scanner scan = new Scanner(System.in);
			long num = scan.nextInt();

			if(num == 0){
				break;
			}
				int ans = 0;
				long tmp;
				long tmp2 = num;

				/*
				 * 処理イメージ
				 * 145 - 1*100 = 45 - 4*10 = 5 - 5*1 = 0 (1+4+5=10)
				 */
				for(int i=999; i>=0; i--){
					for(int s=9; s>=1; s--){
						tmp =(long) (Math.pow(10,i)*s);
						if(tmp2 - tmp >= 0){
							ans += s;
							tmp2 -= tmp;
						}
					}
				}
				System.out.println(ans);
		}
	}

}