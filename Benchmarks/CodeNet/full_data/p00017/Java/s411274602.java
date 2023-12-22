import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// read
		while(sc.hasNext()) {
			String chipher = sc.nextLine(); chipher = chipher.substring(0, chipher.length() - 1);
			String[] split_str = chipher.split(" ");
			int index = 0;
			boolean find = false;
			for(int i = 0; i < 26; i++) {
				for(int j = 0; j < split_str.length; j++) {
					char[] tmp = split_str[j].toCharArray();
					for(int k = 0; k < tmp.length; k++) {
						int inc = (tmp[k] - 'a' + i) % 26;
						tmp[k] = (char) ('a' + inc);
					}
					String _tmp = new String(tmp);
					if(_tmp.equals("the") || _tmp.equals("this") || _tmp.equals("that")) find = true; 
					
				}
				if(find) {
					index = i; break;
				}
			}
			for(int i = 0; i < split_str.length; i++) {
				char[] tmp = split_str[i].toCharArray();
				for(int j = 0; j < tmp.length; j++) {
					int inc = (tmp[j] - 'a' + index) % 26;
					tmp[j] = (char) ('a' + inc);
				}
				String _tmp = new String(tmp);
				if(i != split_str.length - 1) {
					System.out.print("" + _tmp + " ");
				} else {
					System.out.print("" + _tmp);
				}
			}
			System.out.println(".");
		}
	}
}