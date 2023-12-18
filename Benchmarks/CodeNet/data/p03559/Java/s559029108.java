import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {


	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		List<Integer> A = new ArrayList<Integer>();
		List<Integer> B = new ArrayList<Integer>();
		List<Integer> C = new ArrayList<Integer>();

		String[] ainp = br.readLine().split(" ");
		String[] binp = br.readLine().split(" ");
		String[] cinp = br.readLine().split(" ");

		for(int i = 0;i<N;i++){
			A.add(Integer.parseInt(ainp[i]));
			B.add(Integer.parseInt(binp[i]));
			C.add(Integer.parseInt(cinp[i]));
		}

		A.sort(Comparator.reverseOrder());
		B.sort(Comparator.reverseOrder());
		C.sort(Comparator.reverseOrder());

		int nowA = 0;
		int nowB = 0;
		int nowC = 0;
		int count = 0;
		for (int a = 0;a<N;a++){
			nowA = A.get(a);
			for(int b = 0;b<N;b++){
				nowB = B.get(b);
				if(nowA>=nowB)break;
				for(int c = 0;c<N;c++){
					nowC = C.get(c);
					if(nowB>=nowC)break;
					count++;
				}
			}
		}
		System.out.println(count);





	}

}