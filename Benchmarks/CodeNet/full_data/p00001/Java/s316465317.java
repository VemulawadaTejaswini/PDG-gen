import java.util.Arrays;
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int[] in = new int[10];
		for(int i = 0; i < 10; i++) {
			in[i] = sc.nextInt();
		}
		sc.close();
		int[] result = top3(in);
		for(int i: result) System.out.println(i);
	}
	
	static int[] top3(int[] args) {
		int[] copy = Arrays.copyOf(args, args.length);
		Arrays.sort(copy);
		int[] result = new int[3];
		for(int i = 0; i < 3; i++) {
			result[i] = copy[copy.length - 1 - i];
		}
		return result;
	}
}