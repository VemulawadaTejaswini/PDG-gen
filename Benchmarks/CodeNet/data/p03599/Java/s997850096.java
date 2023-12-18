

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
			int yMax = f / 100 / b;
			double concMax = 0.;
			String ans = "";
			for(int y = 0; y <= yMax; y++) {
				int xMax = f / 100 - b*y ;
				for(int x = 0; x <= xMax; x++) {
					int wMax = (f - (a*x + b*y) * 100) / d;
					int wMaxE = ((a*x+b*y)*e)/d;
//					System.out.println("wM:" + wMax + ", wMe:" + wMaxE + ",ev:" + String.valueOf((a*x + b*y) * e));
					if(wMax > wMaxE) {
						wMax = wMaxE;
					}
					for(int w = 0; w <= wMax; w++) {
						int zMax = (f - d*w- (a*x + b*y) * 100)/c;
						int zMaxE = ((a*x + b*y) * e - d*w)/c;
//						System.out.println("zM:" + zMax + ", zMe:" + zMaxE + ",ev:" + String.valueOf((a*x + b*y) * e));
						if(zMax > zMaxE) {
							zMax = zMaxE;
						}
						for(int z = 0; z <= zMax; z++) {
//							System.out.println(x+","+y+","+z+","+w);
							double conc = (c*z + d*w) / (100.0 * (a*x + b*y) + c*z + d*w);
							if(conc > concMax) {
//								System.out.println("update");
								concMax = conc;
								ans = String.valueOf((c*z + d*w + 100 * (a*x + b*y))) + " " + String.valueOf(c*z + d*w);
							}

						}
					}
				}
			}
			System.out.println(ans);
//			System.out.println(concMax);
		}
	}
}
