import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String W = in.readLine();

			int N= Integer.parseInt(W.split(" ")[0]);
			int M= Integer.parseInt(W.split(" ")[1]);
			W = in.readLine();
//			int[] A = new int[M];
			int homework =0;

			for(int i=0;i<M;i++) {
				homework+= Integer.parseInt(W.split(" ")[i]);
			}

			int ans = N - homework;

			if(ans >=0) {
				System.out.println(ans);
			}else {
				System.out.println(-1);
			}

	}

}
