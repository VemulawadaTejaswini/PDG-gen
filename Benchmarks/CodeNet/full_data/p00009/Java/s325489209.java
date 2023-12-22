import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		while(true){
			// キーボード入力
			Scanner stdIn = new Scanner( System.in );
			int n = stdIn.nextInt();
			int count = 0;
			if(n >= 2){
				count++;
			}
			for(int i=1;i<=n;i++){
				int cnt = 0;
				for(int j=2;j<i;j++){
					if(i%j != 0){
						cnt++;
					}
					if(cnt >= i-2){
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}