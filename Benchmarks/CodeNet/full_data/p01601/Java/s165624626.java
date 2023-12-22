import java.util.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int min = 1 << 24;
			String num = null;
			for(int i = 1; ; i++){
				StringBuilder sb = new StringBuilder();
				sb.append(i);
				String s = i + "";
				if(s.equals(sb.reverse().toString())){
					int diff  = n - i;
					if(Math.abs(diff) < min){
						min = Math.abs(diff);
						num = s;
					}
					if(n < i){
						break;
					}
				}
			}
			System.out.println(num);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}