import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int[][][] rooms=new int[4][3][10];
		int n=scan.nextInt();
		int b,f,r,v;
		for(int i=0;i<n;i++){
			b=scan.nextInt();
			f=scan.nextInt();
			r=scan.nextInt();
			v=scan.nextInt();
			rooms[b-1][f-1][r-1]+=v;
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<10;k++){
					System.out.print(" "+rooms[i][j][k]);
				}
				System.out.println();
			}
			if(i==3) break;
			System.out.println("####################");
		}
		scan.close();
	}
}