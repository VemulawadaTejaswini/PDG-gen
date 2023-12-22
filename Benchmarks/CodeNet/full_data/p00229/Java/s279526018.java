import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			final int big = sc.nextInt();
			final int reg = sc.nextInt();
			final int normal = sc.nextInt();
			final int cherry = sc.nextInt();
			final int star = sc.nextInt();
			final int time = sc.nextInt();
			
			if(big == 0 && reg == 0 && normal == 0 && cherry == 0 && star == 0 && time == 0){
				break;
			}
			
			int diff = time;
			int money = 100;
			
			diff -= (5 + 1) * big;
			money += ((15 - 2) * 5 + (15 - 3)) * big;
			
			diff -= (3 + 1) * reg;
			money += ((15 - 2) * 3 + (15 - 3)) * reg;
			
			diff -= normal;
			money += (7 - 3) * normal;
			
			diff -= cherry;
			money += (2 - 3) * cherry;	
			
			//free_game
			diff -= star;
			
			//least is buta
			money -= diff * 3;
			
			System.out.println(money);
			
		}
	}

}