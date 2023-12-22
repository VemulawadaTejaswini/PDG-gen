import java.util.Scanner;
public class Ma {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int sum;

		while(K>0){
			sum = 0;
			int[] n = new int[K];

			for(int i = 0; i < n.length; i++){

				int num = sc.nextInt();
				sum += num;
			}
			System.out.println(sum);
			K = sc.nextInt();


		}
	}
}