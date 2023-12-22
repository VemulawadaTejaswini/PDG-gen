
import java.util.*;
public class Main {

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int [] c = new int[26];
			for(int i = 0 ; i < n; i++){
				String s = sc.next();
				c[s.charAt(0) - 'a']++;
				c[s.charAt(s.length() - 1) - 'a' ]++;
			}
			boolean res = isOK(c);
			System.out.println(res ? "OK" : "NG");
		}
	}
	
	private boolean isOK(int[] c) {
		for(int i = 0 ; i < c.length;i++){
			if(c[i] % 2 != 0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}