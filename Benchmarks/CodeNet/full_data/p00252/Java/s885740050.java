import java.util.*;

public class Main {

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.next() + sc.next() + sc.next();
			if(s.equals("110") || s.equals("001")){
				System.out.println("Open");
			}
			else{
				System.out.println("Close");
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