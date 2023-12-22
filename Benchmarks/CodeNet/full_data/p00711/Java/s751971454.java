import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		for(;;){
			String tile[][] = new String[22][22];
			int num = 1;
			int num_before = 0;
			for(int i = 0; i < 22; i++){
				for(int j = 0; j < 22; j++){
					tile[i][j] = "#";
				}
			}
			int W = scan.nextInt();
			int H = scan.nextInt();
			if(W == 0 && H == 0)
				break;
			for(int i = 1; i <= H; i++){
				String tile_row = scan.next();
				for(int j = 0; j < W ; j++){
					tile[i][j + 1] = tile_row.substring(j,j + 1);
				}
			}
			for(int i = 0; i <= W * H; i++){
				for(int j = 1; j <= H; j++){
					for(int l = 1; l <= W; l++){
						if(tile[j][l].equals("@")){
							if(tile[j - 1][l].equals(".")){
								tile[j - 1][l] = "@";
								num++;
							}
							if(tile[j + 1][l].equals(".")){
								tile[j + 1][l] = "@";
								num++;
							}
							if(tile[j][l - 1].equals(".")){
								tile[j][l - 1] = "@";
								num++;
							}
							if(tile[j][l + 1].equals(".")){
								tile[j][l + 1] = "@";
								num++;
							}
						}
					}
				}
				if(num == num_before)
					break;
				num_before =num;
			}
			System.out.println(num);
		}
	}
}