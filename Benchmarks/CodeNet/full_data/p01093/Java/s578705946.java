import java.util.*;

public class Main{
	void run(){
		Scanner scan = new Scanner(System.in);
		while(true){
			int n = scan.nextInt();
			if(n == 0) break;
			int a[] = new int[n];
			int abs;
			int ans = 1000000;
			for(int i = 0; i < n;i++){
				a[i] = scan.nextInt();
			}
			for(int i = 0; i < n;i++){
				for(int j = 0; j < n; j++){
					if(i != j){
						abs = Math.abs(a[i]-a[j]);
						if(ans > abs) ans = abs;
					}
				}
			}
			System.out.println(ans);
		}
		
	}
	public static void main(String[] args){
		new Main().run();
		
	}
}