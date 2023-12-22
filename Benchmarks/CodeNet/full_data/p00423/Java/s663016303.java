import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sheets = sc.nextInt();
		
		while(sheets != 0){
			int pointA = 0, pointB = 0;
			for (int i = 0; i < sheets; i++) {
				int cardA = sc.nextInt();
				int cardB = sc.nextInt();
				
				if (cardA > cardB) {
					pointA += (cardA + cardB);
				}else if (cardA < cardB) {
					pointB += (cardA + cardB);
				}else {
					pointA += cardA;
					pointB += cardB;
				}
			}
			System.out.printf("%d %d\n", pointA, pointB);
			sheets = sc.nextInt();
		}
		
	}

}