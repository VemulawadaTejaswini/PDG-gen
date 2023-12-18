import java.util.*;


public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			while(true){
				if(a+1 == b){
					System.out.println("Borys");
					break;
				}
				a++;
				if(a+1 == b){
					System.out.println("Alice");
					break;
				}
				b--;
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
