import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		String[] str = br.readLine().split(" ");

		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);

		int L[] =new int[M];
		int R[] =new int[M];

		int Lmax = 0;
		int Rmin = 0;


		for(int i=0;i<M;i++) {

			String[] str1 = br.readLine().split(" ");
			L[i] = Integer.parseInt(str1[0]);
			R[i] = Integer.parseInt(str1[1]);

			if(L[i]>Lmax) {
				Lmax = L[i];
			}

			if(i == 0) {
				Rmin = R[i];
			}

			if(R[i]<Rmin) {
				Rmin = R[i];
			}
		}

		int ans = Rmin - Lmax + 1;

		if(ans > 0) {
			System.out.print(ans);
		}else {
			System.out.print(0);
		}


	}

}
