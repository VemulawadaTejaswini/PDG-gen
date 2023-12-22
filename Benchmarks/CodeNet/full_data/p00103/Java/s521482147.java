import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		int hit = 0;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int i = 0;
		while(i < n*3){
			final String item = scanner.next();
			if(item.equals("HIT")){
				hit++;
				// ???????????????????????????
				if(hit == 4){
					score++;
					hit--;
				}
			}else if(item.equals("HOMERUN")){
				score += (hit+1);
				hit = 0;
			}else if(item.equals("OUT")){
				i++;
				if(i % 3 == 0){
					System.out.println(score);
					score = 0;
					hit = 0;			
				}
			}
		}
	}
}