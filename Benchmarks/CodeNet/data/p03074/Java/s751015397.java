import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] nk = in.readLine().split(" ");
		String s = in.readLine();
		int op = Integer.valueOf(nk[1]);
		int mostlong = 0;
		
		
		
		StringBuilder sb = new StringBuilder(s);
		ArrayList<Short> list = new ArrayList<>();
		
		if(s.startsWith("0")) {
			list.add((short) 0);
		}
		short temp = 0;
		char now = sb.charAt(0);
		for(int i = 0; i < sb.length(); i++) {
			if(now == sb.charAt(i)) {
				temp ++;
			}else {
				now = sb.charAt(i);
				list.add(temp);
				temp = 1;
			}
		}
		list.add(temp);
		int cache = 0;
		for(int i = 0; i < ((list.size() / 2) + 1) - 2; i++) {
			cache = 0;
			for(int j = 0; j < (op * 2) + 1; j++) {
				cache += list.get(i*2 + j);
				if(cache > mostlong) {
					mostlong = cache;
				}
			}
		}
		System.out.print(list.size() != 1?mostlong:list.get(0));
	}
}