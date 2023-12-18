import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();

		int[] S = {A,B,C};
		Arrays.sort(S);

		int max = S[2];
		int second = S[1];
		int min = S[0];

		int count = 0;

		if(max%2 == second%2){
			count += (max-second)/2;
		}
		else{
			count += (max-(second+1))/2;
			count++;
			min++;
		}

		if(max%2 == min%2){
			count+= (max-min)/2;
		}
		else{
			count+=((max+1)-min)/2;
			count++;
		}

		System.out.println(count);
	}

}