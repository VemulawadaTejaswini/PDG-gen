import java.util.*;
 
class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int N = sc.nextInt();
		int M = sc.nextInt();
        int[] H = new int[N];
        for(int i = 0; i < N; i++){
          H[i] = sc.nextInt();
        }
        int[] A = new int[M];
        int[] B = new int[M];
        for(int i = 0; i < M; i++){
          A[i] = sc.nextInt();
          B[i] = sc.nextInt();
        }
      
        int[] max = new int[N];
        for(int i = 0; i < N; i++){
          max[i] = 1;
        }
        
        for(int i = 0; i < M; i++){
          int comp = Math.max(H[A[i]-1], H[B[i]-1]);
          if(H[A[i]-1] == H[B[i]-1]){
            if(max[A[i]-1] == 0 || max[B[i]-1] == 0){
              max[A[i]-1] = 0;
              max[B[i]-1] = 0;
            }
          }else if(comp == H[A[i]-1]){
            max[A[i]-1]++;
            max[B[i]-1] = 0;
          }else if(comp == H[B[i]-1]){
            max[B[i]-1]++;
            max[A[i]-1] = 0;
          }
        }
        
        int count = 0;
        for(int i = 0; i < N; i++){
          if(max[i] != 0){
            count++;
          }
        }
        System.out.println(count);
	}
}