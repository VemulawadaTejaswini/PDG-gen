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
		while(scan.hasNext()){
			int cnt = 0;
			int sima[][] = new int[12][12];
			for(int i = 0 ; i < 12 ; i++){
				String mozi = scan.next();
				char[] a = mozi.toCharArray();
				int ch[] = new int[12];
				for(int j = 0 ; j < 12 ; j++){
					ch[j] = Integer.parseInt("" + a[j]); 
					sima[i][j] = ch[j];
				}
			}
			for(int i = 0 ; i < 12 ; i++){
				for(int j = 0 ; j < 12 ; j++){
					if(sima[i][j] == 1){
						mySystem.Simahantei(i,j,sima);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}
	public void Simahantei(int w , int h ,int sima[][]){
		sima[w][h] = 0;
		if(w+1 < 12){
			if(sima[w+1][h] == 1){
				Simahantei(w+1 , h , sima);
			}
		}
		if(h+1 < 12){
			if(sima[w][h+1] == 1){
				Simahantei(w , h+1 , sima);
			}
		}
		if(w-1 > -1){
			if(sima[w-1][h] == 1){
				Simahantei(w-1 , h , sima);
			}
		}
		if(h-1 > -1){
			if(sima[w][h-1] == 1){
				Simahantei(w , h-1 , sima);
			}
		}
	}
}