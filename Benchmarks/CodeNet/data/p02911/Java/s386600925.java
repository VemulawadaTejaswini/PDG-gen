import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		int[] people = new int[N];
		int d = Q-K;
      
		if(K<=Q){
         	for(int i=0; i<Q; i++){
             	int A = sc.nextInt();
             	people[A-1]++;
			}
			
			for(int i=0; i<N; i++){
				if(people[i]<=d){
					System.out.println("No");
				}else{
					System.out.println("Yes");
				}
			}
		}else{
			for(int i=0; i<N; i++){
				System.out.println("Yes");
			}
		}
	}
}