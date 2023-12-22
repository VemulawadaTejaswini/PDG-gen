import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine().toLowerCase();
        int count = 0;

        while(true) {
        	String t = sc.nextLine().toLowerCase();

        	if(t.equals("end_of_text")) {
        		break;
        	}

        	for(int i = 0; i < t.length()-w.length(); i++) {

        		boolean contain = true;
        		if(t.charAt(i) == w.charAt(0)) {
        			for(int j = 0; j < w.length(); j++) {
        				if(t.charAt(i+j) != w.charAt(j)) {
        					contain = false;
        					break;
        				}
        			}
        			if(contain) { count++; }
        		}

        	}
        }
        System.out.println(count);
    }
}
