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
				if(Arrays.asList(strArray[i]).contains(".")){
					for(int j=0; j<W; j++){
						if(isChanged(i, j, strArray, H, W)){
							strArray[i][j] = "!";
						}
					}
				}
			}

			for(int i=0; i<H; i++){
				if(Arrays.asList(strArray[i]).contains("!")){
					for(int j=0; j<W; j++){
						if(strArray[i][j].equals("!")){
							strArray[i][j] = "#";
						}
					}
				}
			}

		}

		System.out.println(ans);

	}

	static boolean isChanged(int i, int j, String[][] strArray, int H, int W){
		boolean isChanged = false;

		//既に黒なら変えない
		if(strArray[i][j].equals("#")){
			return false;
		}

		//左を調査
		if(j>0 && strArray[i][j-1].equals("#")){
			return true;
		}

		//右を調査
		if(j<W-1 && strArray[i][j+1].equals("#")){
			return true;
		}

		//上を調査
		if(i>0 && strArray[i-1][j].equals("#")){
			return true;
		}

		//下を調査
		if(i<H-1 && strArray[i+1][j].equals("#")){
			return true;
		}

		return isChanged;
	}

	static boolean isAllBlack(String[][] strArray, int H, int W){
		boolean isAllBlack = true;

		for(int i=0; i<H; i++){
				if(Arrays.asList(strArray[i]).contains(".")){
					return false;
			}
		}

		return isAllBlack;
	}

}