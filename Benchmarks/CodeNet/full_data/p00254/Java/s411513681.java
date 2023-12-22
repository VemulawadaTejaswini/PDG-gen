import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while (true) {
			String n = stdIn.next();
			int counter = 0;
			if(n.equals("0000")) {
				break;
			}
			if(n.equals("1111") || n.equals("2222") || n.equals("3333") || n.equals("4444") || n.equals("5555")
					||n.equals("6666") || n.equals("7777") || n.equals("8888") || n.equals("9999")) {
				System.out.println("NA");
				continue;
			}
			while(true) {
				if(n.equals("6174")) {
					break;
				}
				counter++;
				String L = "";
				String tmp = n.substring(0, 4);
				for(int i = 0; i < 4; i++) {
					for(int j = 9; j >= 0; j--) {
						if(tmp.charAt(0) == String.valueOf(j).charAt(0)) {
							L += tmp.substring(0, 1);
							tmp = tmp.substring(1, tmp.length());
							break;
						}
						else if(tmp.length() >= 2 && tmp.charAt(1) == String.valueOf(j).charAt(0)) {
							L += tmp.substring(1,2);
							tmp = tmp.substring(0,1) + tmp.substring(2,tmp.length());
							break;
						}
						else if(tmp.length() >= 3 && tmp.charAt(2) == String.valueOf(j).charAt(0)) {
							L += tmp.substring(2,3);
							tmp = tmp.substring(0,2) + tmp.substring(3,tmp.length());
							break;
						}
						else if(tmp.length() >= 4 && tmp.charAt(3) == String.valueOf(j).charAt(0)) {
							L += tmp.substring(3,4);
							tmp = tmp.substring(0,3);
							break;
						}
					}
				}
				tmp = n.substring(0, 4);
				String S = "";
				for(int i = 0; i < 4; i++) {
					for(int j = 0; j < 10; j++) {
						if(tmp.charAt(0) == String.valueOf(j).charAt(0)) {
							S += tmp.substring(0, 1);
							tmp = tmp.substring(1, tmp.length());
							break;
						}
						else if(tmp.length() >= 2 && tmp.charAt(1) == String.valueOf(j).charAt(0)) {
							S += tmp.substring(1,2);
							tmp = tmp.substring(0,1) + tmp.substring(2,tmp.length());
							break;
						}
						else if(tmp.length() >= 3 && tmp.charAt(2) == String.valueOf(j).charAt(0)) {
							S += tmp.substring(2,3);
							tmp = tmp.substring(0,2) + tmp.substring(3,tmp.length());
							break;
						}
						else if(tmp.length() >= 4 && tmp.charAt(3) == String.valueOf(j).charAt(0)) {
							S += tmp.substring(3,4);
							tmp = tmp.substring(0,3);
							break;
						}
					}
				}
				
				n = Integer.toString(Integer.parseInt(L) - Integer.parseInt(S));
			}
			System.out.println(counter);
		}
	}
}