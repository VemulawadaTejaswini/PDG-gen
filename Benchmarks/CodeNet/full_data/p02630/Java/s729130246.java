import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            int d = sc.nextInt();
			a.add(d);
            }
      
      	int Q = sc.nextInt();
		int[][] BC = new int[Q][2];
     
        

		for (int i = 0; i < Q; i++) {
            BC[i][0] = sc.nextInt();
			BC[i][1] = sc.nextInt();
        }
      
		for (int i = 0; i < Q; i++) {
			Collections.replaceAll(a, (BC[i][0]),(BC[i][1]));
          int sum = 0;
          for (Integer integer : a){sum = sum + integer;}
			System.out.println(sum);
        }
		
	}
 
}
