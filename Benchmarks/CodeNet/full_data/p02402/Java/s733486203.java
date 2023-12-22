import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] number = new int[n];
		String line = scan.nextLine();
		String[] num = line.split("\\s");
		int max = 0;
		int min = 0;
		int sum = 0;
		for(int i = 0; i < n; i++){
			number[i] = Integer.parseInt(num[i]);
			if(i == 0){
				max = number[0];
				min = number[0]:
			}
			if(max < number[i]){
				max = number[i];
			}
			if(min > number[i]){
				min = number[i];
			}
			sum+= number[i];
		}
		System.out.printf("%d %d %d\n", min, max, sum);
	}
}