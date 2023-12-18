import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String s = sc.next();

	    while(s.length() >= 0){
	    	if (s.endsWith("erase") || s.endsWith("dream")){
	    		s = s.substring(0, s.length() - 5).intern();
	    	}else if (s.endsWith("eraser")){
	    		s = s.substring(0, s.length() - 6).intern();
	    	}else if (s.endsWith("dreamer")){
	    		s = s.substring(0, s.length() - 7).intern();
	    	} else if (s.length() <= 0){
	    		System.out.println("YES");
	    		break;
	    	} else{
	    		System.out.println("NO");
	    		break;
	    	}
	    }
	}
}
