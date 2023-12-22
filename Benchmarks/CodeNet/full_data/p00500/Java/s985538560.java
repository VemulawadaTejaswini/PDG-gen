import java.util.*;
public class Main {
	public static void main(String[] args) {
		int n, i = 0, k = 0, game = 0, flag = 0;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int[][] member = new int[n + 1][3];
		int[] point = new int[n + 1];
		for(i = 0; i < n; i++){
			for(game = 0; game < 3; game++){
				member[i][game] = scan.nextInt();
			}
		}
		for(game = 0; game < 3; game++){
			for(i = 0; i < n; i++){
				flag = 0;
				for(k = i + 1; k < n; k++){
					if(member[i][game] == member[k][game]){
						member[k][game] = 0;
						flag = 1;
					}
				}
				if(flag == 1){
					member[i][game] = 0;
				}
			}
			for(i = 0; i < n; i++){
				point[i] += member[i][game]; 
			}
		}
		scan.close();
		for(i = 0; i < n; i++){
			System.out.println(point[i]);
		}
	}
}