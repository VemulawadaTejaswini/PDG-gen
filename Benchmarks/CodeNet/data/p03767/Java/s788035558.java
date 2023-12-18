import java.util.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int [] data = new int[n * 3];
			for(int i = 0; i < n * 3; i++){
				data[i] = sc.nextInt();
			}
			Arrays.sort(data);
			long sum = 0;
			for(int i = n; i < n * 3;i+=2){
				sum += data[i];
			}
			System.out.println(sum);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
