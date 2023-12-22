import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			int[] card = new int[9];
			int[][] color = new int[3][9];
			int[] rgb = new int[3];
			int set = 0;
			for(int j = 0; j < 9; j++){
				card[j] = sc.nextInt();
			}
			for(int j = 0; j < 9; j++){
				String s = sc.next();
				switch(s.charAt(0)){
					case 'R':
						color[0][rgb[0]] = card[j];
						rgb[0]++;
						break;
					case 'G':
						color[1][rgb[1]] = card[j];
						rgb[1]++;
						break;
					case 'B':
						color[2][rgb[2]] = card[j];
						rgb[2]++;
						break;
				}
			}
			for(int j = 0; j < 3; j++){
				Arrays.sort(color[j]);
				for(int k = 2; k < rgb[j]; k++){
					if(color[j][k] == color[j][k-1] && color[j][k-1] == color[j][k-2]){
						set++;
						color[j][k] = 0;
						color[j][k-1] = 0;
						color[j][k-2] = 0;
						k += 2;
					}
				}
				for(int k = 0; k < rgb[j]; k++){
					int tmp = color[j][k];
					int l = 0, m = 0;
					if(tmp == 0) continue;
					for(l = 0; l < rgb[j];l++){
						if(tmp == color[j][l]-1) break;
					}
					if(l == rgb[j]) continue;
					for (m = 0; m < rgb[j];m++ ) {
						if(tmp == color[j][m]-2) break;
					}
					if(m == rgb[j]) continue;
					set++;
					color[j][k] = 0;
					color[j][l] = 0;
					color[j][m] = 0;
				}
			}
			if(set == 3) System.out.println("1");
			else System.out.println("0");
		}
	}
}