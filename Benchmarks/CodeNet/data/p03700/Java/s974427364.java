import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		// 1行、2つ(複数)数字
		String[] ss0 = br.readLine().trim().split(" ", 0);
		int N = Integer.parseInt(ss0[0]);
		long A = Long.parseLong(ss0[1]);
		long B = Long.parseLong(ss0[2]);
		long count=0;

		Long[] ll = new Long[N];

		for(int i = 0; i < N; i++){
			ll[i] = Long.parseLong(br.readLine());
		}
		
		List<Long> l = Arrays.asList(ll);

		//リストのソート
		Collections.sort(l); // 未指定ならば昇順
		
		while (l.get(l.size()-1) > 0){
			for(int i = 0; i < N-1; i++){
				l.set(i, l.get(i)-B);
			}
			l.set(N-1, l.get(N-1)-A);
			
			count += 1;
			Collections.sort(l); // 未指定ならば昇順
		}

		System.out.println(count);
		return;
	}


}
