import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int H = scan.nextInt();
			int W = scan.nextInt();
			String[] S = new String[H];
			char [][]s = new char[H][W];
			int [][]D = new int[H][W];
			
			for(int i = 0;i<H;i++) {
				S[i] = scan.next();
				s[i] = S[i].toCharArray();		
			}
			
			for(int i = 0;i<H;i++) {
				int count = 0;
				for(int j = 0;j<W;j++) {
					if(j==W-1) {
						if(s[i][j]=='.') {
							count++;
						for(int z = j-count+1;z<=j;z++) {
							D[i][z]+=count;
						}
						
						}else {
							for(int z = j-count;z<j;z++) {
								D[i][z]+=count;
							}
						}
						count = 0;
					}
					
					
					if(s[i][j]=='.') {
						count++;
					}else if(s[i][j]=='#'){
						for(int z = j-count;z<j;z++) {
							D[i][z]+=count;
						}
						count = 0;
					} 

				}
			}
			
			for(int j = 0;j<W;j++) {
				int count = 0;
				for(int i = 0;i<H;i++) {
					if(i==H-1) {
						if(s[i][j]=='.') {
							count++;
						for(int z = i-count+1;z<=i;z++) {
							D[z][j]+=count;
						}
						
						}else {
							for(int z = i-count;z<i;z++) {
								D[z][j]+=count;
							}
						}
						count = 0;
					}
					
					
					if(s[i][j]=='.') {
						count++;
					}else if(s[i][j]=='#'){
						for(int z = i-count;z<i;z++) {
							D[z][j]+=count;
						}
						count = 0;
					} 

				}
			}
			
			int max = 0;

			for(int i = 0;i<H;i++) {
				for(int j = 0;j<W;j++) {
					if(max<D[i][j])max = D[i][j];
					
					//System.out.print(D[i][j]);
					//System.out.print(" ");
				}
				//System.out.println();
			}
			
			
			System.out.println(max-1);
			
			
		}
	}
	
}
