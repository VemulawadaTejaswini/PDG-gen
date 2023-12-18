import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int K = in.nextInt();
		
		int[] ABC = {A,B,C};
		int index = 0;
		
		int sum1 = 0;
		
		//[3,1,1] K=5
		
		while (K>0) {
			if (ABC[index] == 0) {
				index++;
			}
			ABC[index]--;
			if(index == 0) {
				sum1++;
			}
			
			if(index == 2) {
				sum1--;
			}
			
			K--;
		}
		
		System.out.println(sum1);
		
		
	}
}
