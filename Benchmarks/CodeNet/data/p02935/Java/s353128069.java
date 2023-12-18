import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		
		double[] V = new double[N];
  		
		double ave = 0;
		int max = 0;
	    int max2 = 0;
		for(int i = 0 ;i<N;i++){
			V[i] = sc.nextInt();
        }
      
      	Arrays.sort(V);
      
 	    ave = (V[N-1] + V[N-2]) /2;
      
      
		System.out.println(ave);
	}
}