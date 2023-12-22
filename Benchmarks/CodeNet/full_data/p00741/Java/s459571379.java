
import java.util.Scanner;

//how many islands
public class Main {
	
//	public static int[][] land;
	public static boolean[][] land;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w,h,count;
//		int[][] land;
		while(true) {
			w = sc.nextInt();
			if(w == 0) {break;}
			h = sc.nextInt();
			count =0;
			
			land = new boolean[h+2][w+2];
			
			for(int i=0;i<h+2;i++) {
				for(int j=0;j<w+2;j++) {
					if(i == 0 || j == 0 || i==h+1 || j==w+1) {				//端っこを0埋め
						land[i][j] = false;
						continue;
					}									//端っこを0埋め
					land[i][j] = (sc.nextInt()==1);
				}
			}
			//end of input data
			
			for(int i=1;i<h+1;i++) {
				for(int j=1;j<w+1;j++) {
					if(land[i][j]) {
						count++;
						sink(i,j);
					}
				}
			}
			
			
			System.out.println(count);
		}
		sc.close();
	}
	
	public static void sink(int i,int j) {
		if(land[i][j]) {
			land[i][j] = false;
			sink(i-1,j-1);
			sink(i-1,j);
			sink(i-1,j+1);
			sink(i,j-1);
			sink(i,j+1);
			sink(i+1,j-1);
			sink(i+1,j);
			sink(i+1,j+1);
		}
	}

}
