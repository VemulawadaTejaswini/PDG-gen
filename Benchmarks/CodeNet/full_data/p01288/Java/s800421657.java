
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	int uf(int[] t , int q){
		if(t[q] == q){
			return q;
		}
		int v = uf(t,t[q]);
		t[q] = v;
		return v;
	}
	
	void run() {
		for(;;){
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			if((n|m)==0){
				break;
			}
			
			int[] t = new int[n];
			int[] d = new int[n];
			for(int i =1 ; i< n ;i++){
				t[i] = sc.nextInt()-1;
				d[i] = t[i];
			}
			
			
			int Query[] = new int[m];
			
			for(int i = 0; i< m; i++){
				char c = sc.next().charAt(0);
				int v = sc.nextInt();
				if(c=='Q'){
					Query[i] = v;
				}else{
					Query[i] = -v;
					t[v-1] = v-1;
				}
			}
			t[0] = 0;
			
			int ans = 0;
			for(int i = 0; i < m; i++){
				int ii = m-i-1;
				
				if(Query[ii] > 0){
					ans += 1+uf(t,Query[ii]-1);
				}else{
					int v = -Query[ii]-1;
					t[v] = d[v];
				}
			}
			for(;;){
				System.out.println(ans);
				
			}
//			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}