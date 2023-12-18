import java.util.*;
class Main{
	public static void main() {
		int[][] A={{0,0,0},{0,0,0},{0,0,0}};
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<9;i++){
			A[i][0]=scan.nextInt();
	}	
	int N;
		int b;
		N=scan.nextInt();
		for(int i=0;i<N;i++){
			b=scan.nextInt();
		for(int i=0;i<9;i++){
			if(b==A[i][0]){
				A[i][1]=1;
			}	
		}	
	}
	for(int i=0;i<3;i++){
		int c=1;
		for(int j=0;j<3;j++){
			c*=A[i+3*j][1];
		}
		if(c){
			System.out.println("Yes");
			return;
		}
	}
	for(int i=0;i<3;i++){
		int c=1;
		for(int j=0;j<3;j++){
			c*=A[3*i+j][1];
		}
		if(c){
			System.out.println("Yes");
			return;
		}
	}
	if(A[0][1]*A[4][1]*A[8][1]||A[2][1]*A[4][1]*A[6][1]){
		System.out.println("Yes");
		return;
	}
	System.out.println("No");
	}
}