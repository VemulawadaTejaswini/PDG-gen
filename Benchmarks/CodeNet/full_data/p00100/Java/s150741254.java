import java.util.*;

public class Main {
	public Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new aoj0100().doIt();
	}
	class aoj0100{
		void doIt(){
			while(true){
				int n = sc.nextInt();
				if(n == 0)break;
				boolean over = false;
				long num[] = new long [4001];
				boolean num2[] = new boolean[4001];
				int ban[] = new int[n];
				int kati[] = new int[n];
				int cnt[] = new int[n];
				for(int i = 0;i < n;i++){
					ban[i] = sc.nextInt();
					kati[i] = sc.nextInt();
					cnt[i] = sc.nextInt();
				}
				for(int i = 0;i < n;i++){
					num[ban[i]] = num[ban[i]] + (kati[i] * cnt[i]);
					if(num[ban[i]] >= 1000000){
						if(!num2[ban[i]]){
							System.out.println(ban[i]);
							num2[ban[i]] = true;
						}
						over = true;
					}
				}
				if(!over)System.out.println("NA");
			}
		}
	}
}