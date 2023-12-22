
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){

			int[][] sima = new int[12][12];
			int count = 0;

			for(int i = 0; i < 12 ; i ++){
				String str = sc.nextLine();

				for(int j = 0; j < 12; j ++){
					String[] s = str.split("");
					sima[i][j] = Integer.parseInt(s[j]);
				}
			}

			for(int i = 0; i < 12; i++){
				for(int j = 0; j < 12; j++){
					if(sima[i][j] == 1){

						IslandMap.check(i, j, sima);
						count++;
					}
				}
			}
			System.out.println(count);
			String line = sc.nextLine();

			if (line == null) {
				break;
			} else {
				continue;
			}
		}
		sc.close();
	}
}

class IslandMap{
	static int[][] sima;
	int tate;
	int yoko;


	public IslandMap(int i, int j, int[][] sima2) {
		this.tate = i;
		this.yoko = j;
		IslandMap.sima = sima2;
	}


	public static void check(int tate , int yoko, int[][] sima){

		sima[tate][yoko] = 0;

		if(tate+1 < 12){
			if(sima[tate+1][yoko] == 1){
				check(tate+1 , yoko , sima);
			}
		}
		if(yoko+1 < 12){
			if(sima[tate][yoko+1] == 1){
				check(tate , yoko+1 , sima);
			}
		}
		if(tate-1 > -1){
			if(sima[tate-1][yoko] == 1){
				check(tate-1 , yoko , sima);
			}
		}
		if(yoko-1 > -1){
			if(sima[tate][yoko-1] == 1){
				check(tate , yoko-1 , sima);
			}
		}
	}
}