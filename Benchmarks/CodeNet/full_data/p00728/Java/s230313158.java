import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int[] point = new int[n];
			int sum = 0, max = 0, min = 1000;
			for(int i = 0; i < n; i++){
				point[i] = sc.nextInt();
				sum += point[i];
				if(point[i] > max) max = point[i];
				if(point[i] < min) min = point[i];
			}
			sum =  sum - max - min;
			System.out.println(sum / (n-2));
		}
	}
}