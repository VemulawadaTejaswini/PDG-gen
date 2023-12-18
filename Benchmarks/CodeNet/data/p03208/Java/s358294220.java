import static java.lang.Integer.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static long N;
	public static long K;


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		N = parseInt(st.nextToken());
		K = parseInt(st.nextToken());
		List<Long> tr = new ArrayList<>();

		for(int i=0;i<N;i++){
			st = new StringTokenizer(br.readLine());
			tr.add((long)parseInt(st.nextToken()));
		}
		Collections.sort(tr);
//		System.out.println(tr);
//		List<Long> newT = tr.stream()
//			.sorted((a, b) -> {
//				return (int)((b-a) / Math.abs(b-a));
//			})
//			.collect(Collectors.toList());

//		System.out.println(newT);
		long max = 100000000000L;
		for(long i=0,b=K-1,len=tr.size()-b;i<len;i++) {
			long m = tr.get((int)(i+b)) -tr.get((int)i);
			if(max > m) {
				max = m;
			}

		}

		System.out.println(max);

	}

}