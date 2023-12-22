import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String name[] = {"A","B","C","D","E"};
		
		while(true){
			int max_team = 0;
			int max_buy = Integer.MIN_VALUE;
			
			for(int i = 0; i < 5; i++){
				int one = sc.nextInt();
				int two = sc.nextInt();
				
				if(one == 0 && two == 0){
					System.exit(0);
				}
				
				if(max_buy < (one + two)){
					max_buy = one + two;
					max_team = i;
				}
			}
			
			System.out.println(name[max_team] + " " + max_buy);
		}
		
		
	}
	
}