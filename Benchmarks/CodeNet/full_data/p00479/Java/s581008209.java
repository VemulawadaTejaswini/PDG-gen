import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		//String text = scan.next();
		Main mySystem = new Main();
		int n = scan.nextInt();
		int masu[][] = new int[n][n];
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < n ; j++){
				masu[j][i] = 0;
			}
		}	
		mySystem.Iro(masu , n , 0 , 0 , 1 , 0);
		int k = scan.nextInt();
		int ai[] = new int[n];
		int bi[] = new int[n];
		for(int i = 0 ; i < k ; i++){
			ai[i] = scan.nextInt();
			bi[i] = scan.nextInt();
		}
		for(int i = 0 ; i < k ; i++){
			System.out.println(masu[ai[i]-1][bi[i]-1]);
		}
	}
	public int[][] Iro(int[][] masu , int n ,int x , int y ,int iro ,int cun){
		if(x < n && x > -1 && y < n && y > -1){
			if(masu[x][y] == 0){
				masu[x][y] = iro;
				if(cun == 0){
					this.Iro(masu, n, x+1, y, iro , cun);
				}else if(cun == 1){
					this.Iro(masu, n, x, y+1, iro , cun);
				}else if(cun == 2){
					this.Iro(masu, n, x-1, y, iro , cun);
				}else{
					this.Iro(masu, n, x, y-1, iro , cun);
				}
			}else if((n % 2 == 0 && x == n/2-1 && y == n/2-1) || (n % 2 == 1 && x == n/2+1 && y == n/2)){
				return masu;
			}else{
				cun++;
				if(cun == 4){
					this.Iro(masu, n, x+1, y+1, iro%3+1, 0);
				}
				if(cun == 1){
					this.Iro(masu, n, x-1, y+1, iro , cun);
				}else if(cun == 2){
					this.Iro(masu, n, x-1, y-1, iro , cun);
				}else if(cun == 3){
					this.Iro(masu, n, x+1, y-1, iro , cun);
				}
			}
		}else{
			++cun;
			if(cun == 4){
				cun = 0;
			}
			if(cun == 1){
				this.Iro(masu, n, x-1, y+1, iro , cun);
			}else if(cun == 2){
				this.Iro(masu, n, x-1, y-1, iro , cun);
			}else if(cun == 3){
				this.Iro(masu, n, x+1, y-1, iro , cun);
			}
		}
		
		return masu;
	}
}