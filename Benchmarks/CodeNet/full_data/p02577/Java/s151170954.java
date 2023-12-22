import java.util.*;

public class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
    	char[] arr = sc.next().toCharArray();
    	int sum = 0;
    	for (char c : arr) {
    	    sum += c - '0';
    	    sum %= 9;
    	}
    	if (sum == 0) {
    	    System.out.println("Yes");
    	} else {
    	    System.out.println("No");
    	}
    }
}

