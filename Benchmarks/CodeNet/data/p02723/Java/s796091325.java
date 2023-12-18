import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	String S = sc.next();
    	sc.close();
    	boolean ans = false;
    	char[] chars = S.toCharArray();
    	if(chars[2] == chars[3] && chars[4] == chars[5]){
    		ans = true;
    	}
    	System.out.println(ans?"Yes":"No");
    }

}