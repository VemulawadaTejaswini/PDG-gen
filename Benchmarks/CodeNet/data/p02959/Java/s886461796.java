import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] numMonsters = new int[N+1];
		int[] capasityHero = new int[N];		
		for(int i=0;i<N+1;i++) {
			numMonsters[i] = sc.nextInt();
		}		
		for(int i=0;i<N; i++) {
			capasityHero[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0;i<N;i++) {
			int defeats = Math.min(numMonsters[i], capasityHero[i]);
			sum += defeats; 
			int ex = capasityHero[i] - defeats;
			sum += Math.min(numMonsters[i+1], ex);
		}
		
		System.out.println(sum);
		
		sc.close();	
	}

}
