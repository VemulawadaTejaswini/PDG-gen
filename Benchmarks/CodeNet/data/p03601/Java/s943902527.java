import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int D = in.nextInt();
		int E = in.nextInt();
		int F = in.nextInt();
		
		float maxP = 0;
		int maxW = Integer.MAX_VALUE;
		int maxS = 0;
		
		for(int i=0;i*100*A<=F;i++) {
			for (int j = 0; i*100*A + j*100*B <=F ; j++) {
				int water = i*100*A + j*100*B;
				if(water==0) continue;
				for (int k = 0; 
						k*C*100 <= E*water
						&& water + k*C <= F; 
						k++) {
					for (int l = 0; 
							(k*C*100 + l*D*100 <= E*water) 
							&& water + k*C + l*D <= F;
							l++) {
						int suger = k*C + l*D;
						if(maxP < 1.0f*suger/(water+suger)){
							maxP = 1.0f*suger/(water+suger);
							maxW = water + suger;
							maxS = suger;
						}
					}
				}
			}
		}
		System.out.println(maxW+" "+maxS);
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}