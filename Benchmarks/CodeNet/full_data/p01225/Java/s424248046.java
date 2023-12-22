import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int T=scan.nextInt();
		for(int roop=0;roop<T;roop++){
			int[] n = new int[9];
			int[][] card = new int[3][9];
			char[] c = new char[9];
			for(int i=0;i<9;i++){
				n[i]=scan.nextInt();
			}
			for(int i=0;i<9;i++){
				c[i]=scan.next().charAt(0);
			}
			for(int i=0;i<9;i++){
				switch(c[i]){
					case 'R':
						card[0][n[i]-1]+=1;
						break;
					case 'G':
						card[1][n[i]-1]+=1;
						break;
					case 'B':
						card[2][n[i]-1]+=1;
						break;
					default:
						break;
				}
			}
			int set=0;
			for(int i=0;i<3;i++){
				for(int j=0;j<9;j++){
					if(card[i][j]>2){
						card[i][j]-=3;
						set+=1;
					}
					while(j<7 && card[i][j]>0 && card[i][j+1]>0 && card[i][j+2]>0){
						for(int k=0;k<3;k++){
							card[i][j+k]-=1;
						}
						set+=1;
					}
				}
			}
			if(set>2){
				System.out.println(1);
			}
			else{
				System.out.println(0);
			}
		}
	}
}