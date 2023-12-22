import java.util.*;

public class Main {
	
	class C{
		String from, to;
		boolean ispermit;
		public C(String from, String to, boolean ispermit) {
			this.from = from;
			this.to = to;
			this.ispermit = ispermit;
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n|m) == 0) break;
			C [] data = new C[n];
			for(int i = 0; i < n; i++){
				boolean ispermit = sc.next().charAt(0) == 'p';
				String from = sc.next().replaceAll("\\?", "\\.");
				String to = sc.next().replaceAll("\\?", "\\.");
				data[i] = new C(from, to, ispermit);
			}
			StringBuilder ans = new StringBuilder();
			int anssize = 0;
			for(int i = 0; i < m; i++){
				String from = sc.next();
				String to = sc.next();
				String msg = sc.next();
				if(check(from, to, data)){
					anssize++;
					ans.append(from + " " + to + " " + msg + "\n");
				}
			}
			System.out.println(anssize);
			System.out.print(ans.toString());
		}
	}

	private boolean check(String from, String to, C[] data) {
		boolean isOK = false;
		for(int i = 0; i < data.length; i++){
			if(from.matches(data[i].from) && to.matches(data[i].to)){
				isOK = data[i].ispermit;
			}
		}
		return isOK;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}