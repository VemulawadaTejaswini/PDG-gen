import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] D = W.split(" ");
		int MOD = 2019;

		long L = Long.parseLong(D[0]);
		long R = Long.parseLong(D[1]);

		long i=L;
		long min =L;
		long i3 = -1;
		long i673 =-1;
		while(i<R && min%MOD == 0){
			if(i%MOD > min){
				min=i;
			}
			if(i % 3 == 0){
				i3 = i;
			}
			if(i % 673 == 0){
				i673 = i;
			}
			i++;
		}

		if(min%MOD == 0){
			min=i;
		}


		if(i3 != -1 && i673 != -1){
			System.out.println(0);
			System.exit(0);
		}

		long ans = 0;

		long st,ed;
		if(min - MOD < L){
			st = L;
		}else{
			st = min - MOD;
		}

		if(min + MOD > R ){
			ed = R ;
		}else{
			ed = min + MOD;
		}
		ans = MOD;
		for(;st <= ed ;st++){
			if(st == min){
				continue;
			}
			long tmp = Long.remainderUnsigned(min*(st), MOD);
			if(tmp < ans ){
				ans = tmp;
			}
		}


		System.out.println(ans);

	}


}
