
import java.util.*;

public class Main {

	private void doIt(){
		Scanner sc = new Scanner(System.in);
		final int START = 540;
		final int END = 1260;
		int [][] data = new int[END + 1][10000 + 1];
		int N,M,r;
		int t,m,s,p;
		while(true){
			N = sc.nextInt();
			M = sc.nextInt();
			if(N == 0 && M == 0){
				break;
			}
			r = sc.nextInt();
			for(int i = START ; i <= END; i++){
				Arrays.fill(data[i], 0);
			}
			
			ArrayList<int []> al = new ArrayList<int []>();
			for(int i = 0; i < r; i++){
				t = sc.nextInt();
				p = sc.nextInt();
				m = sc.nextInt();
				s = sc.nextInt();
				if(s == 1){
					int [] input = {t,p,m,s};
					al.add(input);
				}
				else{
					for(int j = 0; j < al.size(); j++){
						int [] now = al.get(j);
						if(now[1] == p && now[2] == m){
							for(int k =now[0]; k < t; k++){
								data[k][m] = 1;
							}
							al.remove(j);
							break;
						}
					}
				}
			}
			int q = sc.nextInt();
			for(int i =0 ;i < q; i++){
				int ts = sc.nextInt();
				int te = sc.nextInt();
				int mm = sc.nextInt();
				int ans = 0;
				for(int j=ts; j < te; j++){
					ans += data[j][mm];
				}
				System.out.println(ans);
			}
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}