public class 157b {
	public static void main() {
		int[][] A={{0,0,0},{0,0,0},{0,0,0}};
	for(int i=0;i<9;i++){
		scanf("%d",&A[i][0]);	
	}	
	int N;
	int b;
	scanf("%d",&N);
	for(int i=0;i<N;i++){
		scanf("%d",&b);
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
			return 0;
		}
	}
	for(int i=0;i<3;i++){
		int c=1;
		for(int j=0;j<3;j++){
			c*=A[3*i+j][1];
		}
		if(c){
			System.out.println("Yes");
			return 0;
		}
	}
	if(A[0][1]*A[4][1]*A[8][1]||A[2][1]*A[4][1]*A[6][1]){
		System.out.println("Yes");
		return 0;
	}
	System.out.println("No");
	}
}