import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		ArrayList<Integer> sums = new ArrayList<Integer>();
		if(A <= B && N > 1 && N <= Math.pow(10,9) && A <= Math.pow(10,9) && B <= Math.pow(10,9)){
			ArrayList<Integer> num = new ArrayList<Integer>();
			Integer sum = 0;
			for(int i = 0; i < N; i++){
				if(i < N - 1)
					num.add(A);
				else
					num.add(B);
				sum += num.get(i);
			}
			sums.add(sum);
			for(int j = A + 1; j <= B; j++){
				for(int i = N - 2; 0 < i; i--){
					num.set(i, j);
					sum = 0;
					for(Integer k: num)
						sum += k;
					if(!sums.contains(sum))
						sums.add(sum);
				}
			}
			System.out.println(sums.size());
		}else{
			System.out.println(0);
		}
	}
}