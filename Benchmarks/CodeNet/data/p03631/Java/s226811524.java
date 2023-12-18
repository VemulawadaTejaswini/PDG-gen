import java.util.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.next();
			StringBuilder sb = new StringBuilder(s);
			if(sb.reverse().toString().equals(s)){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}

	}


	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
