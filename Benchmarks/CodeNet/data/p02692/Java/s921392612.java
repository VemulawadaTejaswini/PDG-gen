import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int next(long state[] , int i , int j){
		if(state[i] == 0 && state[j] == 0){
			return -1;
		}else if(state[i] >= state[j]){
			state[i]--;
			state[j]++;
			return j;
		}else{
			state[i]++;
			state[j]--;
			return i;
		}
	}
	static void output(List<Character> path){
		System.out.println("Yes");
		for(char c : path){
			System.out.println(c);
		}
	}
	static boolean solve(long A , long B , long C , String S[]){
		long total = A + B + C;
		if(total == 2){
			// 200 , 020, 002, 011, 101, 110
		}else{
			List<Character> path = new ArrayList<Character>();
			long state[] = {A , B , C};
			for(String s : S){
				int i = next(state , "ABC".indexOf(s.charAt(0)) , "ABC".indexOf(s.charAt(1)));
				if(i == -1){
					return false;
				}else{
					path.add("ABC".charAt(i));
				}
			}
			output(path);
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				
		int N = sc.nextInt();
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		String S[] = new String[N];
		for(int i = 0 ; i < N ; ++i){
			S[i] = sc.next();
		}
		if(!solve(A, B, C, S)){
			System.out.println("No");
		}
	}
}
