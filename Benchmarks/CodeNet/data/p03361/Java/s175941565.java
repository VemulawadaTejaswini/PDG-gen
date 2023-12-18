import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();

		String[][] S = new String[H][W];


		for(int i = 0; i < H; i++){
			String buf = sc.next();
			for(int j = 0; j < W; j++){
				S[i][j] = buf.substring(j, j + 1);
			}
		}

		for(int i = 0; i < H; i++){
			for(int j = 0; j < W; j++){
				if (S[i][j]=="#" || S[i][j] == "b"){
					if (j != W - 1 && S[i][j] == "#"){
						if (S[i][j + 1] == "#" || S[i][j + 1] == "b"){
							S[i][j] = "b";
							S[i][j + 1] = "b";
						}
					}
					if (i != H - 1 && S[i][j] == "#"){
						if (S[i + 1][j] == "#" || S[i + 1][j] == "b"){
							S[i][j] = "b";
							S[i + 1][j] = "b";
						}
					}
				}
			}
		}

		int ans = 0;
		int bcnt = 0;
		for(int i = 0; i < H; i++){
			for(int j = 0; j < W; j++){
				if (S[i][j]=="#"){
					ans++;
				}
				if (S[i][j]=="b"){
					bcnt++;
				}
			}
		}

		if (ans == 0 && bcnt > 0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}
}