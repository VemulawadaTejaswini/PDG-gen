import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner cin = new Scanner(System.in);

		int H = cin.nextInt();
		int W = cin.nextInt();
		int K = cin.nextInt();
		int start_i =0;
		int start_j =0;
		int count_uW=0;
		int count_dW=0;
		int count_lW=0;
		int count_rW=0;
		int target = 0;
		int result = 0;
		String tmp;
		char map[][] = new char[H][W];

		for(int i=0;i<H;i++){
			tmp = cin.next();
			for(int j=0;j<W;j++){
				map[i][j] = tmp.charAt(j);
				if(map[i][j]=='S'){
					start_i = i;
					start_j = j;
				}
			}
		}
		for(int x=0;x<H;x++){
			if(map[x][start_j]=='#'){
				if(x<start_i){
					count_uW++;
				}else{
					count_dW++;
				}
			}
		}
		for(int y=0;y<W;y++){
			if(map[start_i][y]=='#'){
				if(y<start_j){
					count_lW++;
				}else{
					count_rW++;
				}
			}
		}
		if(map[start_i-1][start_j]=='#'){
			count_uW+=K;
		}
		if(map[start_i+1][start_j]=='#'){
			count_dW+=K;
		}
		if(map[start_i][start_j-1]=='#'){
			count_lW+=K;
		}
		if(map[start_i+1][start_j+1]=='#'){
			count_rW+=K;
		}
		target = Math.min(Math.min(count_uW,count_dW),Math.min(count_lW, count_rW));

		result = (int)Math.ceil(target/K);
		System.out.println(result+1);
	}

}
