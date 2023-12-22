import java.util.Scanner;

class Main
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int[][] a = new int[101][101];
		
		int r = scan.nextInt();
		int c = scan.nextInt();
		
		for(int i=0; i<=r; i++){
		for(int q=0; q<=c; q++){
			a[i][q] = 0;}}
		
		for(int i=0; i<r; i++){
		for(int q=0; q<c; q++){
			a[i][q] = scan.nextInt();
			a[i][c] += a[i][q];
			a[r][q] += a[i][q];
			a[r][c] += a[i][q];}}
			
		for(int i=0; i<=r; i++){
		for(int q=0; q<=c; q++){
			System.out.print(a[i][q]);
			if(q!=c){
				System.out.print(" ");}}
			System.out.print("\n");}
	}
}
