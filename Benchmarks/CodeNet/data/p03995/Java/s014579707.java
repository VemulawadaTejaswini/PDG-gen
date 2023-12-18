import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
 
public class Main {
	static Scanner in;
	static int r, c, n, ri, ci;
	static long a[][];
	static String ans = "Yes";
	public static void main(String[] args) throws FileNotFoundException {
//		in = new Scanner(new File("input.txt"));
		in = new Scanner(System.in);
		r = in.nextInt();
		c = in.nextInt();
		n = in.nextInt();
		a = new long[r + 1][c + 1];
		for(int i = 1;i <= r;i++){
			for(int j = 1;j <= c;j++){
				a[i][j] = -1;
			}
		}
		while(n-- > 0){
			ri = in.nextInt();
			ci = in.nextInt();
			a[ri][ci] = in.nextLong();
		}
		if(r == 2 && c == 2){
			if(a[1][1] == -1 && a[2][1] + a[1][2] - a[2][2] < 0) ans = "No";
			else if(a[1][2] == -1 && a[2][2] + a[1][1] - a[2][1] < 0) ans = "No";
			else if(a[2][1] == -1 && a[2][2] + a[1][1] - a[1][2] < 0) ans = "No";
			else if(a[2][2] == -1 && a[2][1] + a[1][2] - a[1][1] < 0) ans = "No";
			else{
				if(a[1][1] + a[2][2] != a[1][2] + a[2][1]) ans = "No";
			}
		}else{
			// check horizontal
			for(int i = 1;i <= r - 2;i++){
				long first = -1;
				long second = -1;
				for(int j = 1;j <= c;j++){
					if(a[i][j] != -1 && a[i + 2][j] != -1){
						if(first >= 0) second = Math.abs(a[i][j] - a[i + 2][j]);
						else{
							first = Math.abs(a[i][j] - a[i + 2][j]);
							second = Math.abs(a[i][j] - a[i + 2][j]);
						}
						if(first != second){
							ans = "No";
							break;
						}
					}
				}
			}
			// check vertical
			for(int i = 1;i <= c - 2;i++){
				long first = -1;
				long second = -1;
				for(int j = 1;j <= r;j++){
					if(a[j][i] != -1 && a[j][i + 2] != -1){
						if(first >= 0) second = Math.abs(a[j][i] - a[j][i + 2]);
						else{
							first = Math.abs(a[j][i] - a[j][i + 2]);
							second = Math.abs(a[j][i] - a[j][i + 2]);
						}
						if(first != second){
							ans = "No";
							break;
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}