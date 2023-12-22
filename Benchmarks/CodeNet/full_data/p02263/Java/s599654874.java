import java.util.Scanner;
import java.util.Stack;
  
public class Main {
    public static final String plus = "+";
    public static final String minus = "-";
    public static final String kake = "*";
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		String strInt = null;
		int intStr = 0;
		int numInt1 = 0;
		int numInt2 = 0;
		int total = 0;
		Stack stack = new Stack();
		while(sc.hasNext()){
			strInt = sc.next();
				intStr = Integer.parseInt(strInt);
				stack.push(intStr);

}
}
}