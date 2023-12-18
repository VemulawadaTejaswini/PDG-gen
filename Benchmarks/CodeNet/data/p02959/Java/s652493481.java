import java.util.Scanner;

public class Main{
	
	public static void main(String... args){
		Scanner scan = new Scanner(System.in);
		
		// input
		final int NUM = scan.nextInt();
		int[] monsters = new int[NUM+1];
		int[] heroes = new int[NUM];
		for(int i = 0; i <= NUM; i++){
			monsters[i] = scan.nextInt();
		}
		for(int i = 0; i < NUM; i++){
			heroes[i] = scan.nextInt();
		}
		
		// check
		int count = 0;
		for(int i = 0; i < NUM; i++){
			if(monsters[i] < heroes[i]){
				count += monsters[i];
				heroes[i] -= monsters[i];
				monsters[i] = 0;
				if(monsters[i+1] < heroes[i]){
					count += monsters[i+1];
					heroes[i] -= monsters[i+1];
					monsters[i+1] = 0;
				}else {
					count += heroes[i];
					monsters[i+1] -= heroes[i];
					heroes[i] = 0;
				}
			} else {
				count += heroes[i];
				monsters[i] -= heroes[i];
				heroes[i] = 0;
			}
		}
		
		// answer
		System.out.println(count);
		
	}
}

