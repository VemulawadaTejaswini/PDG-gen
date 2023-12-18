import java.util.Scanner;
import java.lang.Integer;

class Main2{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		char target;
		char direction;
		int N = Integer.parseInt(sc.next());
		int Q = Integer.parseInt(sc.next());

		String str = sc.next();
		String spell;
		int[] golems = new int[N];

		for(int i =0; i < N; i++){
			golems[i] = 1;
		}

		sc.nextLine();

		for(int i = 0; i < Q; i++){
			spell = sc.nextLine();
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