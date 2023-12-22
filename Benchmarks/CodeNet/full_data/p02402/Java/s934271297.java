import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int min =1000000;
		int max = -1000000;
		long sum = 0;
		
		int line = sc.nextInt();
		int L[] = new int[line];
		
		for(int i = 0; i < line; i++){
			int value = sc.nextInt();
			
			if(min > value){
				min = value;
			}
			if(max < value){
				max = value;
			}
			sum += value;
		}
		System.out.println(String.format("%d %d %d", min, max, sum));
		sc.close();
	}
}