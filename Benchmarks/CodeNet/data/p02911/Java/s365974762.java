import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		int[] people = new int[N];
		Arrays.fill(people, K);
      
		for(int i=0; i<Q; i++){
			int A = sc.nextInt();
			for(int j=0; j<N; j++){
				if(j+1 != A){
					people[j]--;
                }
            }
        }
		for(int i=0; i<N; i++){
			if(people[i]<=0){
				System.out.println("No");
            }else{
				System.out.println("Yes");
            }
        }
    }
}