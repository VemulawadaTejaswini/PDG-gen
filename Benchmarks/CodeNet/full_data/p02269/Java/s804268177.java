import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		Map<String,String> map = new HashMap<String,String>();

		for (int i=0; i<n; i++) {
			String s = stdIn.next();
			String str = stdIn.next();
			if (s.equals("insert")) {
				map.put(str,str);
			}else {
				if(map.containsKey(str))
					System.out.println("yes");
				else
					System.out.println("no");
			}
		}
	}
}