import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main (String[] args) throws IOException{
	    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
	    BufferedReader in = new BufferedReader(reader);
		int num = Integer.parseInt(in.readLine());
		String[][] strs = new String[num][];
		String[] str = new String[5];

		for(int i = 0; i<num; i++) {
			str = in.readLine().split(" ");
			strs[i] = str;
		}
		for(int i = 0; i<num; i++) {
			int n = 0;
			int cnt = 0;
			int A = Integer.parseInt(strs[i][0]);
			int X = Integer.parseInt(strs[i][1]);
			int B = Integer.parseInt(strs[i][2]);
			int Y = Integer.parseInt(strs[i][3]);
			int C = Integer.parseInt(strs[i][4]);

			int Anum = 0;
			int Bnum = 0;

			for(int j=0; j<X; j++) {
				Anum += A;
				if(Anum % C == 0) {
					cnt++;
					j++;
				}
				for(int k=n; k<Y; k++) {
					Bnum += B;
					if(j==0 && Bnum % C == 0) {
						cnt++;
						Bnum = 0;
					}
					if((Anum+Bnum) % C == 0) {
						cnt++;
						j++;
						n=k+1;
					}
				}
				Bnum = 0;
			}
			System.out.println(cnt);
		}
	}
}