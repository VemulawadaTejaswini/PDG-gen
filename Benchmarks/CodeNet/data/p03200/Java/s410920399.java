import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	String s = sc.next();
	    	int count = 0;
	    	int dis = 0;
	    	String[] str = new String[s.length()];
	    	for (int i = 0; i < str.length; i++) {
			str[i] = String.valueOf(s.charAt(i));
		}
	    	for (int i = 0; i < s.length()-1; i++) {
	    		for (int j = i+1; j > dis; j--) {
	    			if (str[j].equals("W")) {
					if (str[j-1].equals("B")) {
						str[j-1] = "W";
						str[j] = "B";
						count++;
					} else {
						dis++;
						break;
					}
				}
			}
		}
	    	System.out.println(count);
	}
}
