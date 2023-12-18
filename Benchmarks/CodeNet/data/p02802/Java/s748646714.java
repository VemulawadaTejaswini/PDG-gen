import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int p;
		String S;

		int ac = 0;
		int wa = 0;
		int score[] = new int[n];
		for(int i = 0; i < n; i++){
			score[i] = 0;
		}
		
		for(int i = 0; i < m; i++){
			p = scan.nextInt()-1;
			S = scan.next();
			
			if(score[p] >= 0){
				
				if(S.equals("AC")){
					ac++;
					wa += score[p];
					score[p] = -1;
				}
				else{
					score[p]++;
				}
				
			}
			
		}
		
		System.out.println(ac+" "+wa);

	}
}