import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	private void doit(){
		while(true){
			int n = sc.nextInt();
			if(n == 0)break;
			int [] data = new int[n + 1];
			for(int i = 0; i <= n; i++){
				data[i] = sc.nextInt();
			}
			for(int i = 0; i <= n; i++){
				int a = 0, b = 1;
				int diff = 1 << 24;
				boolean flg = false;
				for(;;a++, b++){
					if(a == i){
						if(i ==0){
							b++;
						}
						a++;
					}
					if(b == i) b++;
					if(b > n) break;
					int now = data[b] - data[a];
					if(diff == (1 << 24)){
						diff = now;
					}
					else if(diff != now){
						flg = true;
						break;
					}
				}
				if(! flg){
					System.out.println(data[i]);
					break;
				}
			}
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}