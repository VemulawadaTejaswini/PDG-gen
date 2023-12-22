public class Main {
	public static void main(String[] main){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int n = scan.nextInt();
		int[][] A = new int[3][10];
		int[][] B = new int[3][10];
		int[][] C = new int[3][10];
		int[][] D = new int[3][10];
		
		for(int i = 0;i<3;i++){
			for(int j = 0;j<10;j++){
				A[i][j] = 0;
				B[i][j] = 0;
				C[i][j] = 0;
				D[i][j] = 0;
			}
		}
		for(int i = 0; i < n;i++){
			int b = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			int v = scan.nextInt();
			if(b == 1){
				A[f-1][r-1] += v;
			}else if(b == 2){
				B[f-1][r-1] += v;
			}else if(b == 3){
				C[f-1][r-1] += v;
			}else if(b == 4){
				D[f-1][r-1] += v;
			}
		}
		for(int i = 0;i<3;i++){
			for(int j = 0;j<10;j++){
				System.out.print(" "+A[i][j]);
			}
			System.out.println();
		}
		System.out.println("####################");
		for(int i = 0;i<3;i++){
			for(int j = 0;j<10;j++){
				System.out.print(" "+B[i][j]);
			}
			System.out.println();
		}
		System.out.println("####################");
		for(int i = 0;i<3;i++){
			for(int j = 0;j<10;j++){
				System.out.print(" "+C[i][j]);
			}
			System.out.println();
		}
		System.out.println("####################");
		for(int i = 0;i<3;i++){
			for(int j = 0;j<10;j++){
				System.out.print(" "+D[i][j]);
			}
			System.out.println();
		}
	}
}