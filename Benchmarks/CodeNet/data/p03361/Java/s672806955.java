import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int w = in.nextInt();
		boolean[][] s = new boolean[h+2][w+2];
		for(int i=1;i<=h;i++) {
			String str = in.next();
			for(int j=1;j<=w;j++) {
				if(str.charAt(j-1)=='#') {
					s[i][j] = true;
				}
			}
		}
		
		boolean drawable = true;
		for(int i=1;i<=h;i++) {
			for(int j=1;j<=w;j++) {
				if(s[i][j]) {
					 if(s[i-1][j] || s[i+1][j] || s[i][j-1] || s[i][j+1]) {
						
					 }else {
						 drawable = false;
						 break;
					 }
				}
			}
			if(!drawable) break;
		}
		
		if(drawable) System.out.println("Yes");
		else System.out.println("No");
		
		in.close();

	}

}
