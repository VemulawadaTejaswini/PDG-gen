import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

	static boolean[] used = new boolean[10];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true){
			try{
				int n = scan.nextInt();
				int s = scan.nextInt();
				System.out.println(solve(n, s));
			}catch(NoSuchElementException e){
				break;
			}
		}
	}

	//大きい値から計算していく
	private static int solve(int numRemained, int s){
//		System.out.printf("%d %s\n", numRemained, s);
		if(numRemained == 1){
			if(s <= 9 && used[s] == false)
				return 1;
			else
				return 0;
		}
		
		int c = 0;
		for(int i = 9; i >= 0; i--){
			if(used[i])	continue;
			used[i] = true;
			int sum =  s - numRemained * i;
			if(sum >= 0)
				c += solve(numRemained - 1, sum);
			used[i] = false;
		}
//		System.out.println(c);
		return c;
	}
}