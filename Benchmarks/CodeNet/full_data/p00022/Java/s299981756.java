import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("[^-0-9.]+");
		
		double x=0, y=0;
		int a=0;
		while(true){
			int n = scan.nextInt();
			
			if(n == 0){
				break;
			}
			
			int si = 0;
			int max = 0;
			int min = 0;
			for(int i=0;i<n;i++){
				int ai = scan.nextInt();
				
				si += ai;
					
				if(si-min > max){
					max = si-min;
				}
				
				if(si < min){
					min = si;
				}
			}
			System.out.println(max);
		}
	}
}