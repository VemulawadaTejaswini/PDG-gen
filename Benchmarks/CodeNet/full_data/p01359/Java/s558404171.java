import java.util.*;
public class Main { 
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true) {
			ArrayList<Data> list = new ArrayList<Data>();
			int n = stdIn.nextInt();
			int q = stdIn.nextInt();
			if(n == 0 && q == 0) break;
			for(int i = 0; i < n; i++) {
				String nm = stdIn.next();
				int c = stdIn.nextInt();
				int y = stdIn.nextInt();
				list.add(new Data(nm,c,y));
			}
			CO:for(int i = 0; i < q; i++) {
				int a = stdIn.nextInt();
				for(int j = 0; j < list.size(); j++) {
					Data tmp = list.get(j);
					if(a <= tmp.year && a > tmp.year - tmp.count) {
						System.out.println(tmp.eraName + " " + (tmp.count-(tmp.year - a)));
						continue CO;
					}
				}
				System.out.println("Unknown");
				
			}
		}
	}
}
class Data {
	String eraName;
	int count;
	int year;
	public Data(String n, int c, int y) {
		eraName = n;
		count = c;
		year = y;
	}
}