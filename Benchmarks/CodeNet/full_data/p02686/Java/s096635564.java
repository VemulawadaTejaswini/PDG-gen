import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static class Updown implements Comparable<Updown>{
		int up;
		int minup;
		public Updown(int a , int b) {
			up = a;
			minup = b;
		}
		@Override
		public int compareTo(Updown o) {
			return o.minup - minup;
		}
	}
	static Updown calcUpdown(String bracket){
		int u = 0;
		int mu = 0;
		for(char c : bracket.toCharArray()){
			if(c == '('){
				++u;
			}else{
				--u;
				mu = Math.min(mu, u);
			}
		}
		return new Updown(u, mu);
	}
	
	static boolean checkNegative(List<Updown> updowns){
		int cur = 0;
		Collections.sort(updowns);
		for(Updown u : updowns){
			if(cur + u.minup < 0){
				return false;
			}
			cur += u.up;
		}
		return true;
	}
	static boolean canArrange(Updown uds[]){
		int tot = 0;
		List<Updown> lefts = new ArrayList<>();
		List<Updown> rights = new ArrayList<>();
		for(Updown u : uds){
			tot += u.up;
			if(u.up >= 0){
				lefts.add(u);
			}else{
				rights.add(new Updown(- u.up , u.minup - u.up));
			}
		}
		if(tot != 0){
			return false;
		}
		return checkNegative(lefts) && checkNegative(rights);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Updown uds[] = new Updown[N];
		for(int i = 0 ; i < N ; ++i){
			String bracket = sc.next();
			Updown ud = calcUpdown(bracket);
			uds[i] = ud;
		}
		if(canArrange(uds)){
			System.out.println("Yes");
		}else{
			System.out.println("No");			
		}
	}
}
