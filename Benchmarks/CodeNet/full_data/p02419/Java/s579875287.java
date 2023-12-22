import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int count = 0;
		String check = sc.next();
		while(true) {
        String str = sc.next();
        	if(str.equals("END_OF_TEXT")) {
        		break;
        	}
        	if(str.toLowerCase().equals(check)) {
        		count++;
        	}
		}
		System.out.println(count);
    }
}
