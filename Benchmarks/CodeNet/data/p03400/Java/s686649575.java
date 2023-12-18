import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] dx = br.readLine().split(" ");
		int D = Integer.parseInt(dx[0]);
		int X = Integer.parseInt(dx[1]);

		List<Integer> A = new ArrayList<Integer>();

		for(int i = 0;i<N;i++){
			A.add(Integer.parseInt(br.readLine()));
		}
		int chocount = X;
		for(int i = 0;i<N;i++){
			for(int j = 1;j<=D;j += A.get(i)){
				chocount += 1;
			}
		}

		System.out.println(chocount);
	}

}
