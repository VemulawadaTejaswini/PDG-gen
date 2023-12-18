import java.util.*;

public class Main {

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int c = sc.nextInt();
			int k = sc.nextInt();
			int [] data = new int[n];
			for(int i = 0; i < data.length; i++){
				data[i] = sc.nextInt();
			}
			Arrays.sort(data);
			int ans = 0;
			int start = Integer.MIN_VALUE;
			int count = 0;
			for(int i = 0; i < n; i++){
				if(start + k < data[i] || count == c){
					start = data[i];
					count = 1;
					ans++;
				}
				else{
					count++;
				}
			}
			System.out.println(ans);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
