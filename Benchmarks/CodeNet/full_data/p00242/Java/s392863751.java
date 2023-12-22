import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	private void doit() {
		while (true) {
			int n = Integer.parseInt(sc.nextLine());
			if(n == 0)break;
			String [][] data = new String [n][];
			for(int i = 0; i < n; i++){
				data[i] = sc.nextLine().split(" ");
			}
			char c = sc.nextLine().charAt(0);
			TreeSet<String> set = new TreeSet<String>();
			for(int i = 0; i < n; i++){
				for(int j = 0; j < data[i].length; j++){
					if(c == data[i][j].charAt(0)){
						set.add(data[i][j]);
					}
				}
			}
			int count = 0;
			StringBuilder sb = new StringBuilder();
			for(String str: set){
				sb.append(" " + str);
				count++;
				if(count == 5) break;
			}
			if(count == 0){
				System.out.println("NA");
				continue;
			}
			System.out.println(sb.substring(1));
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}