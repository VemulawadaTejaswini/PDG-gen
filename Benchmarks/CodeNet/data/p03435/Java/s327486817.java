import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] youso=new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				youso[i][j]=sc.nextInt();
			}
		}

		int[] tmp=new int[3];
		tmp[0]=youso[1][0]-youso[0][0];
		tmp[1]=youso[2][0]-youso[1][0];
		tmp[2]=youso[2][0]-youso[0][0];
		int aa[][]= {{1,0},{2,1},{2,0}};
		boolean[] vali=new boolean[3];
		for(int i=0; i<3; i++) {
			vali[i]=true;
		}
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(youso[aa[i][0]][j]-youso[aa[i][1]][j]!=tmp[i]) {
					System.out.println("No");
					System.exit(0);
				}
			}
		}
		System.out.println("Yes");
	}
}