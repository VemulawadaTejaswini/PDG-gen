import java.util.*;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    	int i, j;
    	while(true) {
        	String moji = sc.nextLine();
    		int sum = 0;
    		if(moji.equals("0")) break;
    	
    		for(char c : moji.toCharArray()) {
    			sum += Integer.parseInt(String.valueOf(c));
    		}
    		System.out.println(sum);
    	}
    }
}
