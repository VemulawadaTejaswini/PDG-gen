public class Main {
	static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();

		int[][] arr  = new int[r+1][c+1];
		int[] tate = new int[r];
		int[] yoko = new int[c];
		int i,j;
		for(i = 0;i<r;i++){
			for(j = 0;j<c;j++){
				arr[i][j] = scan.nextInt();
				arr[i][c] += arr[i][j];
				arr[r][j] += arr[i][j];
				arr[r][c] += arr[i][j];
			}
		}
		for(i = 0;i<=r;i++){
			for(j = 0;j<=c;j++){
				if(j == c){
					System.out.println(arr[i][j]);
				}else{
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}
}