import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
      	int i = 0;
        int min = N + 1;
        int count = 0; 
      	int P[] = new int[N];
      	for(i = 0;i < N;i++){
          A[i] = sc.nextInt();
          if(A[i] < min){
            min = A[i];
            count += 1;
          }
        }
       System.out.println(count);            
    }
}