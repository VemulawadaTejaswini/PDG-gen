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
		while(n != 0){
			int masu[][] = new int[n][n];
			int hantei[][] = new int[n][n];
			for(int i = 0 ; i < n ; i++){
				for(int j = 0 ; j < n ; j++){
					hantei[j][i] = 0;
				}
			}
			masu[n/2][n/2+1] = 1;
			hantei[n/2][n/2+1] = 1;
			mySystem.kensaku(masu , hantei , 2 , (n/2+1) , (n/2+2) , n);
			for(int i = 0 ; i < n ; i++){
				for(int j = 0 ; j < n ; j++){
					if(masu[j][i] < 10){
						System.out.print("   ");
					}else if(masu[j][i] < 100){
						System.out.print("  ");
					}else{
						System.out.print(" ");
					}
					System.out.print(masu[j][i]);
				}
				System.out.println();
			}
			n = scan.nextInt();
		}
	}
	public int[][] kensaku(int[][] masu , int[][] hantei , int cun , int x , int y , int n){
		if(cun <= n*n){
			if(x < n && y < n){
				if(hantei[x][y] == 0){
					masu[x][y] = cun;
					hantei[x][y] = 1;
						kensaku(masu , hantei , cun+1 , x+1 , y+1 , n);
				}else{
					if(x-1 >= 0){
						kensaku(masu , hantei , cun , x-1 , y+1 , n);
					}else{
						kensaku(masu , hantei , cun , n-1 , y+1 , n);
					}
				}
			}else if(x >=  n){
				kensaku(masu , hantei , cun , 0 , y , n);
			}else if(y >= n){
				kensaku(masu , hantei , cun , x , 0 , n);
			}
		}
		return masu;
	}
}