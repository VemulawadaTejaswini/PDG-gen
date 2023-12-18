import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        int count = 0;
        int i = 0;
		for(i = 0;i < N; i++){
          A[i] = sc.nextInt();
        }
        for(i = 0;i < N; i++){
          if(i == A[A[i]]){
            count += 1;
          }
        }
        count /2;
		System.out.println(count);            
    }
}