import java.time.Instant;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[][] strArray = new String[H][W];

		for(int i=0; i<H; i++){
			strArray[i] = sc.next().split("");
		}


		int ans = 0;
		while(!isAllBlack(strArray, H, W)){
			ans++;
			for(int i=0; i<H; i++){
				if(Arrays.asList(strArray[i]).contains("#")){
					for(int j=0; j<W; j++){
						if(strArray[i][j].equals("#")){
							strArray = update(i, j, strArray, H, W);
						}
					}
				}
			}

			for(int i=0; i<H; i++){
				if(Arrays.asList(strArray[i]).contains("#") || Arrays.asList(strArray[i]).contains("!")){
					for(int j=0; j<W; j++){
						if(strArray[i][j].equals("#")){
							strArray[i][j] = ",";
						}

						if(strArray[i][j].equals("!")){
							strArray[i][j] = "#";
						}
					}
				}

			}

		}

		System.out.println(ans);

	}

	static String[][] update(int i, int j, String[][] strArray, int H, int W){


		//左を更新
		if(j>0 && strArray[i][j-1].equals(".")){
			strArray[i][j-1] = "!";
		}

		//右を更新
		if(j<W-1 && strArray[i][j+1].equals(".")){
			strArray[i][j+1] = "!";
		}

		//上を更新
		if(i>0 && strArray[i-1][j].equals(".")){
			strArray[i-1][j] = "!";
		}

		//下を更新
		if(i<H-1 && strArray[i+1][j].equals(".")){
			strArray[i+1][j] = "!";
		}

		return strArray;
	}

	static boolean isAllBlack(String[][] strArray, int H, int W){
		boolean isAllBlack = true;

		for(int i=0; i<H; i++){
			for(int j=0; j<W; j++){
				if(!strArray[i][j].equals("#") && !strArray[i][j].equals(",")){
					return false;
				}
			}
		}

		return isAllBlack;
	}

}