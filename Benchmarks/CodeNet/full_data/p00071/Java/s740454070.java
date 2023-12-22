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
		int det[][][] = new int[n][8][8];
		int x[] = new int[n];
		int y[] = new int[n];
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < 8 ; j++){
				String in = scan.next();
				char[] ounT = in.toCharArray();
				for(int k = 0 ; k < 8 ; k++){
					det[i][k][j] = Integer.parseInt(""+ounT[k]);
				}
			}
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
		}
		for(int i = 0 ; i < n ; i++){
			mySystem.bakuhatu(det , x[i]-1 , y [i]-1 , i);
		}
		for(int i = 0 ; i < n ; i++){
			System.out.println("Data " + (i+1) +":");
			for(int j = 0 ; j < 8 ; j++){
				for(int k = 0 ; k < 8 ; k++){
					System.out.print(det[i][k][j]);
				}
				System.out.println();
			}
		}
	}
	public int[][][] bakuhatu(int[][][] det , int x , int y , int n){
			System.out.println(det[n][x][y]+" "+x+" "+y);
		if(det[n][x][y] == 1){
			det[n][x][y] = 0;
			for(int i = 1 ; i <= 3 ; i++){
				if(x+i < 8){
					bakuhatu(det , x+i , y , n);
				}else{
					break;
				}
			}
			for(int i = 1 ; i <= 3 ; i++){
				if(y+i < 8){
					bakuhatu(det , x , y+i , n);
				}else{
					break;
				}
			}
			for(int i = 1 ; i <= 3 ; i++){
				if(x-i >= 0){
					bakuhatu(det , x-i , y , n);
				}
			}
			for(int i = 1 ; i <=3 ; i++){
				if(y-i >= 0){
					bakuhatu(det , x , y-i , n);
				}
			}
		}
		return det;
	}
}