import java.util.Scanner;

class Main{
	public static void main(String[] args){
		
		Scanner stdin = new Scanner(System.in);
		
		char target;
		char direction;
		int N = stdin.nextInt();
		int Q = stdin.nextInt();

		String str = stdin.next();
		String spell;
		int[] golems = new int[N];

		for(int i =0; i < N; i++){
			golems[i] = 1;
		}

		stdin.nextLine();

		for(int i = 0; i < Q; i++){
			spell = stdin.nextLine();
			for(int j = 0; j < N; j++){
				if(spell.charAt(0) == str.charAt(j)){
					if(spell.charAt(2) == 'L' && j > 0){
						golems[j-1] += golems[j];
					}else if(spell.charAt(2) == 'R' && j < N-1){
						golems[j+1] += golems[j];
					}
					golems[j] = 0;
				}
			}
		}
		int sum = 0;
		for(int i = 0; i < N; i++){
			sum += golems[i];
		}
		System.out.println(sum);
	}
}