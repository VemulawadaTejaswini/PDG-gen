import java.util.*;

public class Main {

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			HashMap<Character, Character> map = new HashMap<Character, Character>();
			for(int i = 0; i < n; i++){
				char c = sc.next().charAt(0);
				char d = sc.next().charAt(0);
				map.put(c, d);
			}
			int m = sc.nextInt();
			while(m-- > 0){
				char c = sc.next().charAt(0);
				if(map.containsKey(c)){
					System.out.print(map.get(c));
				}
				else{
					System.out.print(c);
				}
			}
			System.out.println();
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}