import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		int N_int = Integer.parseInt(N);
		String A = sc.nextLine();
		// System.out.println(A);
		sc.close();

		long result=0;

		String[] num_str = A.split(" ");
		int[] num_int = new int[N_int];

		for(int i=0; i < N_int; i++){
			num_int[i] = Integer.parseInt(num_str[i]);
			}


		for(int j=0; j < N_int-1; j++){
				if (num_int[j] > num_int[j+1]){
					result += num_int[j]- num_int[j+1];
					num_int[j+1] = num_int[j];
				}
				else{
					continue;
				}
			}
		System.out.println(result);
	}
}
