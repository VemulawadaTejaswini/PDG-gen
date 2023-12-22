import java.util.*;

class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int[] A = new int[n];
      	for (int i=0; i<n; i++) {A[i] = - sc.nextInt();}//－にしておく
      
      	int comfort = 0;
      
      	//－なので昇順ににソートしてよい
      	Arrays.sort(A);
      	//順番に到着
      	comfort += A[0];
      	if (n % 2 == 0) {
        	for (int i=1; i<n/2; i++) {
            	comfort += A[i] * 2;
            }
        } else {
        	for (int i=1; i<n/2; i++) {
            	comfort += A[i] * 2;
            }
          comfort += A[n/2];
        }
      	System.out.println(-comfort);//最後に正にする
      
    }
}