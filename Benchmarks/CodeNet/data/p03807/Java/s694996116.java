import java.util.*;

public class Main {
	
	private void doit(){
		
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int [] data = new int[n];
			for(int i = 0; i < n; i++){
				data[i] = sc.nextInt();
			}
			int count = 0;
			for(int i = 0; i < n; i++){
				if(data[i] % 2 == 1){
					count++;
				}
			}
			if(count % 2 == 0){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
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
