import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	boolean isok = true;
	if(s.length()<4) {
	    System.out.println("WA");
	    return;
	}
	if(s.charAt(0) != 'A') {
	    System.out.println("WA");
            return;
	}
	String miniS = s.substring(2, s.length()-1);
	String ms = miniS.replace("C", "");
	if(miniS.length() - ms.length() != 1) {
	    System.out.println("WA");
            return;
	}
	String lowcase = s.charAt(1) + ms.substring(0, ms.length()) + s.charAt(s.length()-1);
	if(!lowcase.equals(lowcase.toLowerCase())) {
	    System.out.println("WA");
            return;
	}
	System.out.println("AC");
    }
}