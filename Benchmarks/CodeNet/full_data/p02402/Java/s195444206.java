import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ai[] = new int[5];
		int min,max;
		long sum = 0;
		
		for(int i = 0;i < ai.length;i++){
			ai[i] = sc.nextInt();
			sum += sc.nextInt();
		}
		max = ai[0];
		min = ai[0];
		for(int i = 1;i <= n;i++){
			if(ai[i] > max){
				max = ai[i];
			}
			if(ai[i] < min){
				min = ai[i];
			}
			System.out.println(min + " " + max + " " + sum);
		}sc.close();
	}

}