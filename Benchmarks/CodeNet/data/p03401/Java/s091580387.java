import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n+2];
		array[0] = 0;
		array[n+1] = 0;
		for(int i = 1; i < n+1;i++) array[i] = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < n+1;i++) sum += Math.abs(array[i] - array[i+1]);
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < n+1;i++) {
			sb.append(sum - Math.abs(array[i-1] - array[i]) - Math.abs(array[i] - array[i+1]) + Math.abs(array[i-1] - array[i+1]));
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
