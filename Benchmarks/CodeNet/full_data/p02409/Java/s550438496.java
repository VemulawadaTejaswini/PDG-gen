import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][][] count = new int[4][3][10];
		for(int i=0;i<n;i++){
				count[scan.nextInt()][scan.nextInt()][scan.nextInt()]=scan.nextInt();
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<10;k++){
					System.out.print(" "+count[i][j][k]);
				}
				System.out.println("");
			}
			if(i!=3)
				System.out.println("####################");
		}
	}
}