import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
    	String t = sc.nextLine();
    	if(t.startsWith(s) && t.length() == s.length() + 1){
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
    	}
    }
}