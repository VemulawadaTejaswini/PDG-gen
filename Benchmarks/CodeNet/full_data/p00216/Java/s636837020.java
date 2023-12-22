import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int w = sc.nextInt();
			
			if(w == -1){
				break;
			}
			
			int sum = 1150;
			sum += w > 10 ? (10 - (20 - Math.min(20, w))) * 125 : 0;
			sum += w > 20 ? (10 - (30 - Math.min(30, w))) * 140 : 0;
			sum += w > 30 ? (w - 30) * 160 : 0;
			
			System.out.println(4280 - sum);
		}

	}

}