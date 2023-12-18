import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int t = scan.nextInt();
		
		int s = scan.nextInt();
		int sum = 0;

		for(int i = 1 ; i < n ; < i++){
			
			int time = scan.nextInt();
			if(time - s >= t){
				sum += t;
			} else {
				sum += time - s;
			}
			s = time;
		}
		System.out.println(sum);
	}
}