import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine().toLowerCase();
        int count = 0;

        while(true) {
        	String t = sc.nextLine();
        	if(t.equals("END_OF_TEXT")) {
        		break;
        	}

        	t = t.toLowerCase();

        	for(int i = 0; i < t.length()-w.length()+1; i++) {

        		boolean contain = true;
        		if(t.charAt(i) == w.charAt(0)) {
        			for(int j = 0; j < w.length(); j++) {
        				if(t.charAt(i+j) != w.charAt(j)) {
        					contain = false;
        					break;
        				}
        			}
        			if(contain) {
        				count++;
        				i += w.length()-1;
        			}
        		}

        	}
        }
        System.out.println(count);
    }
}
