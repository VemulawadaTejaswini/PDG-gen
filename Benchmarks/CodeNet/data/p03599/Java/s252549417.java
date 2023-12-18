import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class Main{
	
	public static void main(String[] args) throws IOException{
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int D = in.nextInt();
		int E = in.nextInt();
		int F = in.nextInt();
		double maxP = 0;
		int maxW = 100 * A, maxS = 0;
		
		for(int i = 0; 100 * A * i <= F; i++){
			for(int j = 0; 100 * B * j <= F; j++){
				if(i == 0 && j == 0) continue;
				
				int wA = 100 * A * i;
				int wB = 100 * B * j;
				if(wA + wB > F) break;
				int e = (wA + wB) * E / 100;
				
				for(int k = 0; k * C <= e; k++){
					for(int m = 0; m * D <= e; m++){
						int sC = k * C;
						int sD = m * D;
						if(sC + sD > e) break;
						if(wA + wB + sC + sD > F) break;
						
						if(1.0 * (sC + sD) / (wA + wB + sC + sD) > maxP){
							maxP = 1.0 * (sC + sD) / (wA + wB + sC + sD);
							maxW = wA + wB;
							maxS = sC + sD;
						}
					}
				}
			}
		}
		
		System.out.println((maxW + maxS) + " " + maxS);
	}
}
