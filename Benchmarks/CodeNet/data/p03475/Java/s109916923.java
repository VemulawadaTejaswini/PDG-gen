import java.util.*;

class Main{
	
	static int N;
	static int[] C ;
	static int[] S ;
	static int[] F ;
	static int[] G ;
	
	public static void main(String[] args){
		
		
		readInfo();
		
		for(int i = 0 ; i < N ; i++){
			int time = 0;
			for(int j = i ; j < N - 1; j++){
				time = arriveTime(j , time);
			}
			G[i] = time;
			System.out.println(G[i]);
		}
		
	}
	static int arriveTime(int trainNo , int startTime){
		
		int result = 0;
		if(startTime == 0 ){
			result = S[trainNo] + C[trainNo];
		}else if(startTime < S[trainNo]){
			result = S[trainNo] + C[trainNo];
		}else if( startTime % F[trainNo] == 0){
			result = startTime + C[trainNo];
		}else{
			result = F[trainNo] * ( startTime / F[trainNo]  + 1) + C[trainNo];
		}
		return result;
	}

	
	static void readInfo(){
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
//		N = 3;
		
		C = new int[ N - 1];
		S = new int[ N - 1];
		F = new int[ N - 1];
		G = new int[ N ];
		
		
//		C[0] = 6 ; C[1] = 1 ;
//		S[0] = 5 ; S[1] = 10 ;
//		F[0] = 1 ; F[1] = 1 ;
//		G[0] = 0 ; G[1] = 0 ; G[2] = 0 ;
		
		for(int i = 0 ;i < N  ; i++){
			if(i < N - 1){
				C[i] = sc.nextInt();
				S[i] = sc.nextInt();
				F[i] = sc.nextInt();
			}
			G[i] = 0;
		}
	}
}
