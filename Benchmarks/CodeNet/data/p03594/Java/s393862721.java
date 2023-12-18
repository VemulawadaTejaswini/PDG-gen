import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args){
		solve();
	}

	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int d = sc.nextInt();
		String[] s = {"R","Y","G","B"};
		String[] t = new String[w];
		boolean[][][] flag = new boolean[4][h][w];
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				for(int k=0;k<4;k++){
					if(i-d>=0){
						if(flag[k][i-d][j]){
							continue;
						}
					}
					if(j-d>=0){
						if(flag[k][i][j-d]){
							continue;
						}
					}
					if(j==0){
						t[i] = s[k];
						flag[k][i][j] = true;
					}
					else{
						t[i] = t[i] + s[k];
						flag[k][i][j] = true;
					}
					for(int x=0;x<=d;x++){
						if(i+x<h && j+d-x<w){
							flag[k][i+x][j+d-x] = true;
						}
					}
					break;
				}
			}
		}
		for(int i=0;i<h;i++){
			System.out.println(t[i]);
		}
	}
}

