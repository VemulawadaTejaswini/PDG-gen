import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int x = sc.nextInt();
			if(n==0 && x ==0)break;               // n と x が共に 0 ならばループ終了
			int c =0;                             // 変数 c を初期化
			for(int i = 1; i <= n;i++){
				for(int k = i+1; k<=n;k++){
					for(int o = k+1; o<=n; o++){
						if(i + k + o == x){      // i と k と o の合計が x のとき、
							c++;                 // c に 1 を足す
						}
					}
				}
			}
			System.out.println(c);
		}
	}

}