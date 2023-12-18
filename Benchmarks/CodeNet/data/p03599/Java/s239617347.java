import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String[] tmp = br.readLine().split(" ");
			int a = Integer.parseInt(tmp[0]);
			int b = Integer.parseInt(tmp[1]);
			int c = Integer.parseInt(tmp[2]);
			int d = Integer.parseInt(tmp[3]);
			int e = Integer.parseInt(tmp[4]);
			int f = Integer.parseInt(tmp[5]);
			int yMax = ( f - 2 ) / 100 - 1;
			double concMax = 0.;
			String ans = "";
			for(int y = 1; y < yMax; y++) {
				int xMax = ( f - 2 ) / 100 - y ;
				for(int x = 1; x < xMax; x++) {
					int wMax = f - 1 - (x + y) * 100;
					for(int w = 1; w < wMax; w++) {
						int zMax = f - w- (x + y) * 100;
						for(int z = 1; z < zMax; z++) {
							double conc = (c*z + d*w) / (100.0 * (a*x + b*y) );
							if(conc > concMax) {
								concMax = conc;
								ans = String.valueOf((c*z + d*w + 100 * (a*x + b*y))) + " " + String.valueOf(c*z + d*w);
							}

						}
					}
				}
			}
			System.out.println(ans);
		}
	}
}