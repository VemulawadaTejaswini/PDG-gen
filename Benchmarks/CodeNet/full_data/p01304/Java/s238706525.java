import java.util.*;
public class main {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int l=0; l<a; l++){
			int gx=sc.nextInt();
			int gy=sc.nextInt();
			int No [][] = new int [gx+1][gy+1];
			int b = sc.nextInt();
			for (int k=0; k<b; k++){
				int x1=sc.nextInt();
				int y1=sc.nextInt();
				int x2=sc.nextInt();
				int y2=sc.nextInt();
				
				if (x1 == x2) {
					No [x1][(Math.max(y1, y2))]+=1;
				}
				else {No[(Math.max(x1,x2))][y1]+=2;}			
			}
			int Total[][] = new int [gx+1][gy+1];
			Total[0][0] = 1;
			for (int i=0; i<=gx; i++){
				for (int j=0; j<=gy; j++){
					if (No[i][j] == 0){
						if (i>0 & j>0){
							Total[i][j]=Total[i-1][j]+Total[i][j-1];
						}
						else if (i>0){
							Total[i][j]=Total[i-1][j];
						}
						else if (j>0){
							Total[i][j]=Total[i][j-1];
						}
						else;
					}
					else if(No[i][j] == 1){
						if (i>0){
							Total[i][j]=Total[i-1][j];
							}
						else Total[i][j]=0;
					}
					else if(No[i][j] == 2){
						if (j>0){
						Total[i][j]=Total[i][j-1];
						}
						else Total[i][j]=0;
					}
					else {
						Total[i][j]=0;
					}
				}
				
		
			}
			if (Total[gx][gy]==0){
				System.out.println("Miserable Hokusai!");
			}
			else {System.out.println(Total[gx][gy]);
			}
		}
	}
}