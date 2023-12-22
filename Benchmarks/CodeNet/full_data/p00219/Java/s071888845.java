import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	private void doit() {
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int [] freq = new int[10];
			while(n-- > 0){
				freq[sc.nextInt()]++;
			}
			for(int i = 0; i < 10; i++){
				if(freq[i] == 0){
					System.out.println("-");
				}
				else{
					for(int j = 0; j < freq[i]; j++){
						System.out.print("*");
					}
					System.out.println();
				}
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