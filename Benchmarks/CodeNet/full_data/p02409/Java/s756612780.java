import java.util.Scanner;

public class Main{	
	public static void main(String[] arts){
		Scanner sc = new Scanner(System.in);
		int b,f,r,v;
		int[][][] x;
		x = new int [4][3][10];  //棟　階　部屋
		int num = sc.nextInt();
		for(int i=0;i<num;i++){
			b = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			v = sc.nextInt();
			x[b-1][f-1][r-1]+=v;
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<10;k++){
						System.out.printf(" %d",x[i][j][k]);
				}
				System.out.println();
			}
			if(i!=3){
				for(int l=0;l<20;l++){
					System.out.print("#");
				}
				System.out.println();
			}
		}
		sc.close();
	}
}
