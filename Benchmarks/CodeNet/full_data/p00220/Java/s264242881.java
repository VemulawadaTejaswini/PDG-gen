import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	private void doit() {
		while (true) {
			double n = sc.nextDouble();
			if(n < 0) break;
			int nint = (int)n;
			String s = Integer.toBinaryString(nint);
			if(s.length() >= 9){
				System.out.println("NA");
				continue;
			}
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < 8 - s.length(); i++){
				sb.append(0);
			}
			sb.append(s);
			sb.append(".");
			boolean flg = false;
			n = n - nint;
			for(int i = 0; i < 4; i++){
				if(n * 2 >= 1.0){
					sb.append(1);
					n = n * 2 - (int)(n * 2);
					if(n == 0.0){
						for(int j = i+1; j < 4; j++){
							sb.append("0");
						}
						flg = true;
						break;
					}
				}
				else{
					sb.append(0);
				}
			}
			if(flg){
				System.out.println(sb.toString());
			}
			else{
				System.out.println("NA");
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