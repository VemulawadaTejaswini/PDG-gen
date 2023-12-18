import java.util.Scanner;

class Point{
	int x;
	int y;
	Point(int a,int b){
		this.x = a;
		this.y = b;
	}

}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();

		String[][] S = new String[H][W];
		for(int i = 0 ; i < H ; i++){
			String tmp = sc.next();
			for(int j = 0 ; j < W ; j++){
				S[i][j] = tmp.substring(j, j+1);
			}
		}
		sc.close();

		int[][] HH = new int[H][W];
		int[][] WW = new int[H][W];

		for(int i = 0 ; i < H ; i++){
			for(int j = 0 ; j < W ; j++){
				if(S[i][j].equals("#")){
					HH[i][j] = -1;
				}
				else if(S[i][j].equals(".") && j==0){
					for(int k = j ; k < W ; k++){
						if(S[i][k].equals(".")){
							HH[i][j]++;
						}
						else{
							break;
						}
					}
				}
				else if(S[i][j].equals(".") && HH[i][j-1] == -1){
					for(int k = j ; k < W ; k++){
						if(S[i][k].equals(".")){
							HH[i][j]++;
						}
						else{
							break;
						}
					}
				}
				else if(S[i][j].equals(".") && HH[i][j-1] > 0){
					HH[i][j] = HH[i][j-1];
				}
				//System.out.println(HH[i][j]);
			}
		}


		for(int i = 0 ; i < W ; i++){
			for(int j = 0 ; j < H ; j++){
				if(S[j][i].equals("#")){
					WW[j][i] = -1;
				}
				else if(S[j][i].equals(".") && j==0){
					for(int k = j ; k < H ; k++){
						if(S[k][i].equals(".")){
							WW[j][i]++;
						}
						else{
							break;
						}
					}
				}
				else if(S[j][i].equals(".") && WW[j-1][i] == -1){
					for(int k = j ; k < H ; k++){
						if(S[k][i].equals(".")){
							WW[j][i]++;
						}
						else{
							break;
						}
					}
				}
				else if(S[j][i].equals(".") && WW[j-1][i] > 0){
					WW[j][i] = WW[j-1][i];
				}
				//System.out.println(WW[j][i]);
			}
		}

		int ans = 0;

		for(int i = 0 ; i < H ; i++){
			for(int j = 0 ; j < W ; j++){
				ans = Math.max(ans, HH[i][j] + WW[i][j]);
			}
		}

		System.out.println(ans-1);


	}
}