import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			while(sc.hasNext()){
				int d = sc.nextInt();
				int sq = 0;
				
				for(int t = d; t <= 600 - d; t = t + d){
					sq = sq + t * t * d;
				}
				
				System.out.println(sq);
			}
	}
}