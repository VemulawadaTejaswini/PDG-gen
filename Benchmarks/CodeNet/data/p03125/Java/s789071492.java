import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      
      	int N = sc.nextInt();
      	int M = sc.nextInt();
      
      	int[] arr = new int[M];
      
      	for (int i=0; i<N; i++) {
        	int K = sc.nextInt();
          
          	for (int j=0; j<K; j++) {
            	int index = sc.nextInt();
              	arr[index-1] += 1;
            }
        }
      
      	int count = 0;
      	for (int i=0; i<M; i++) {
         	if (arr[i] == N) {
             	count++; 
            }
        }
      
      	System.out.println(count);
    }
}