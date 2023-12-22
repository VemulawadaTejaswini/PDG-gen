import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		while(sc.hasNext()){
			new aoj0095().doIt();
		}
	}
	class aoj0095 {	
		void doIt() {
			int n = sc.nextInt();
			int asum[] = new int [n+1];
			for(int i = 0;i < n;i++){
				int a = sc.nextInt();
				int v = sc.nextInt();
				asum[a] = asum[a] + v;
			}
			int maxa = 1;
			int maxv = 0;
			for(int i = 1;i <= n;i++){
				if(maxv < asum[i]){
					maxa = i;
					maxv = asum[i];
				}
			}
			System.out.println(maxa+" "+maxv);
		}
	}
}