import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		char[] a = sc.next().toCharArray();
		if (Arrays.asList(a).contains("a") &&
			Arrays.asList(a).contains("b") &&Arrays.asList(a).contains("c")){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
    }
}