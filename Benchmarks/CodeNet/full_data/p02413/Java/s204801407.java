import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		int[][] a = new int[r][c];
		int[] sum = new int[r];

		for(int i=0;i<r;r++){
			for(int j=0;j<c;c++){
				a[i][j] = scan.nextInt();
			}
		}

		for(int i=0;i<r;r++){
			for(int j=0;j<c;c++){
				sum[i]= sum[i]+a[i][j];
			}
		}

		for(int data:sum){
			System.out.print(data+" ");
		}
		System.out.println();
	}
	}