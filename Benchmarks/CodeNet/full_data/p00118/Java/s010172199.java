import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		for(;;){
			int num = 1;
			String farm[][] = new String[102][102];
			for(int i = 0; i < 102; i++){
				for(int j = 0; j < 102; j++){
					farm[i][j] = "0";
				}
			}
			int H = scan.nextInt();
			int W = scan.nextInt();
			if(H == 0 && W == 0)
				break;
			for(int i = 1; i <= H; i++){
				String farm_row = scan.next();
				for(int j = 1; j <= W; j++){
					farm[i][j] = farm_row.substring(j , j + 1);
				}
			}
			for(int i = 1; i < H; i++){
				for(int j = 1; j < W; j++){
					if(farm[i][j].equals("#")){
						farm[i][j] = String.valueOf(num);
						for(int k = 0; k < W * H; k++){
							for(int l = 1; l < H; l++){
								for(int m = 1; m < W; m++){
									if(farm[l][m].equals(num)){
										if(farm[l][m - 1].equals("#")){
											farm[l][m - 1] = String.valueOf(num);
										}
									}
									if(farm[l][m].equals(num)){
										if(farm[l][m + 1].equals("#")){
											farm[l][m + 1] = String.valueOf(num);
										}
									}
									if(farm[l][m].equals(num)){
										if(farm[l - 1][m].equals("#")){
											farm[l - 1][m] = String.valueOf(num);
										}
									}
									if(farm[l][m].equals(num)){
										if(farm[l + 1][m].equals("#")){
											farm[l + 1][m] = String.valueOf(num);
										}
									}
								}
							}
						}
					}
					if(farm[i][j].equals("@")){
						farm[i][j] = String.valueOf(num);
						for(int k = 0; k < W * H; k++){
							for(int l = 1; l < H; l++){
								for(int m = 1; m < W; m++){
									if(farm[l][m].equals(num)){
										if(farm[l][m - 1].equals("@")){
											farm[l][m - 1] = String.valueOf(num);
										}
									}
									if(farm[l][m].equals(num)){
										if(farm[l][m + 1].equals("@")){
											farm[l][m + 1] = String.valueOf(num);
										}
									}
									if(farm[l][m].equals(num)){
										if(farm[l - 1][m].equals("@")){
											farm[l - 1][m] = String.valueOf(num);
										}
									}
									if(farm[l][m].equals(num)){
										if(farm[l + 1][m].equals("@")){
											farm[l + 1][m] = String.valueOf(num);
										}
									}
								}
							}
						}
					}
					if(farm[i][j].equals("*")){
						farm[i][j] = String.valueOf(num);
						for(int k = 0; k < W * H; k++){
							for(int l = 1; l < H; l++){
								for(int m = 1; m < W; m++){
									if(farm[l][m].equals(num)){
										if(farm[l][m - 1].equals("*")){
											farm[l][m - 1] = String.valueOf(num);
										}
									}
									if(farm[l][m].equals(num)){
										if(farm[l][m + 1].equals("*")){
											farm[l][m + 1] = String.valueOf(num);
										}
									}
									if(farm[l][m].equals(num)){
										if(farm[l - 1][m].equals("*")){
											farm[l - 1][m] = String.valueOf(num);
										}
									}
									if(farm[l][m].equals(num)){
										if(farm[l + 1][m].equals("*")){
											farm[l + 1][m] = String.valueOf(num);
										}
									}
								}
							}
						}
					}
				}
				num++;
			}
			System.out.println(num - 1);
		}
	}
}