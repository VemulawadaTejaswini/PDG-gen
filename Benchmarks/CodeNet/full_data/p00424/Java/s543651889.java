import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);

	//0501
	static class DataConversion {
		HashMap<String, String> map;
		void convert() {
			for(;;) {
				int n = Integer.parseInt(sc.nextLine());
				if(n==0) break;
				map = new HashMap<String, String>();
				for(int i=0; i<n; i++) {
					String[] str = sc.nextLine().split(" ");
					//System.out.println(str[0] + ":" + str[1]);
					map.put(str[0], str[1]);
				}
				int m = Integer.parseInt(sc.nextLine());
				StringBuilder sb = new StringBuilder();
				for(int i=0; i<m; i++) {
					String c = sc.nextLine();
					if(map.get(c) == null) sb.append(c);
					else sb.append(map.get(c));
				}
				System.out.println(new String(sb));
			}
		}
	}

	public static void main(String[] args) {
		DataConversion dc = new DataConversion();
		dc.convert();
	}
}