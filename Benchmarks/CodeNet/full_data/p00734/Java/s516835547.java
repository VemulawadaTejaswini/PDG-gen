import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	public void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n|m)==0){
				break;
			}
			int taro []= new int[n];
			int hana [] = new int [m];
			int tsum = 0;
			int hsum = 0;
			for(int i = 0 ; i < n ; i++)
			{
				taro[i] = sc.nextInt();
				tsum += taro[i];
			}
			for(int i = 0 ; i < m ; i++){
				hana[i] = sc.nextInt();
				hsum += hana[i];
			}
			
			int T=0;
			int H=0;
			int minTH=-1;
			for(int i = 0 ; i < n ; i++){
				for(int j = 0; j < m; j++){
					if(tsum - hsum == (taro[i] - hana[j])*2){
						if(minTH == -1 || minTH > taro[i]+hana[j]){
							T = taro[i];
							H = hana[j];
							minTH = T+H;
						}
					}
				}				
			}
			System.out.println(minTH==-1?-1:(T + " " + H));
		}
		
	}
	public static void main(String[] Aregs){
		Main a = new Main();
		a.run();
	}
}