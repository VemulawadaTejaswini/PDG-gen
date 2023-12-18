import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] s = new String[h];
		char[][] c = new char[h+2][w+2];
		Arrays.fill(c, '.');
		for(int i=0; i<h; i++){
			s[i] = sc.next();
			for(int j=0; j<w; j++){
				c[i+1][j+1] = s[i].charAt(j);
			}
		}
		boolean bl = true;
		for(int i=1; i<=h; i++){
			for(int j=1; j<=w; j++){
				if(c[i][j]=='.')break;
				else {
					if(c[i-1][j]!='#' && c[i+1][j]!='#' && c[i][j-1]!='#' && c[i][j+1]!='#'){
						bl=false;
						break;
					}
				}
			}
		}
		System.out.println(bl==true? "Yes" : "No");
	}
}