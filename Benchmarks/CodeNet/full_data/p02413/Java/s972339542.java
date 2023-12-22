

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// ????????????????????????
		String[] size = new String[2];
		size = br.readLine().split(" ");

		int gyoR = Integer.parseInt(size[0]);
		int retsuC = Integer.parseInt(size[1]);

		int[][] spreadSheet = new int[gyoR + 1][retsuC + 1];


			// ?¶????????????±??\???
			
			for (int i = 0; i < gyoR; i++) {
				String tempInfo = br.readLine();
				String[] info = tempInfo.split(" ");

				for (int j = 0; j < retsuC; j++) {
					spreadSheet[i][j] = Integer.parseInt(info[j]);
					spreadSheet[i][retsuC] += Integer.parseInt(info[j]);
					spreadSheet[gyoR][j] += Integer.parseInt(info[j]);
					spreadSheet[gyoR][retsuC] += Integer.parseInt(info[j]);
				}
			}
			for (int i = 0; i < gyoR + 1; i++) {
				for (int j = 0; j < retsuC; j++) {
					System.out.print(spreadSheet[i][j] + " ");
				}
				System.out.println(spreadSheet[i][retsuC]);
			}
		}
	}