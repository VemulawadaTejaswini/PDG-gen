import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int bd[][][] = new int[4][3][10];
		int n = sc.nextInt();
		int i,j,k,b,f,r,v;
		for(i=0;i<n;i++){
			b = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			v = sc.nextInt();
			
			if((bd[(b-1)][(f-1)][(r-1)]+v) >= 0){
				bd[(b-1)][(f-1)][(r-1)] += v;
			}
		}
		for(i=0;i<4;i++){
			for(j=0;j<3;j++){
				for(k=0;k<10;k++){
					System.out.print(" "+bd[i][j][k]);
				}
				System.out.println();
			}
			if(i==3){
				break;
			}
			System.out.println("####################");
		}
		sc.close();
	}

}

