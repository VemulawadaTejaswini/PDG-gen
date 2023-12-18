import java.util.*;

public class Main {
	double EPS = 10.e-08;
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int [][] data = new int[n][26];
			
			for(int i = 0; i < n; i++){
				String s = sc.next();
				for(int j = 0 ; j < s.length(); j++){
					data[i][s.charAt(j) - 'a']++;
				}
			}
			
			String [] res = new String[n];
			for(int i = 0; i < n; i++){
				StringBuilder sb = new StringBuilder();
				for(int j = 0; j < 26; j++){
					sb.append(" " + data[i][j]);
				}
				res[i] = sb.toString();
			}
			
			int count = 0;
			for(int i = 0; i < n; i++){
				boolean flg = false;
				for(int j = i + 1; j < n; j++){
					if(res[i].equals(res[j])){
						count++;
					}
				}
			}
			System.out.println(count);
			
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
