import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] s = new char[h][w];
		for(int i = 0; i < h; i++) {
			s[i] = sc.next().toCharArray();
		}
		int[][] count = new int[h][w];
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(s[i][j]=='#') {
					count[i][j]=-1;
					continue;
				}
				if(j-1>=0&&s[i][j-1]=='#') count[i][j]++;
				if(i-1>=0&&s[i-1][j]=='#') count[i][j]++;
				if(i+1<h&&s[i+1][j]=='#')  count[i][j]++;
				if(j+1<w&&s[i][j+1]=='#') count[i][j]++;
				if(i-1>=0&&j-1>=0&&s[i-1][j-1]=='#') count[i][j]++;
				if(i-1>=0&&j+1<w&&s[i-1][j+1]=='#') count[i][j]++;
				if(i+1<h&&j+1<w&&s[i+1][j+1]=='#') count[i][j]++;
				if(i+1<h&&j-1>=0&&s[i+1][j-1]=='#') count[i][j]++;
			}
		}
		for(int i = 0; i < h; i++) {
			String ans = "";
			for(int j = 0; j < w; j++) {
				if(count[i][j]==-1)ans+='#';
				else ans += count[i][j];
			}
			System.out.println(ans);
		}
	}
}