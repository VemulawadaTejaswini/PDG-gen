import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int n,k;
    	n = in.nextInt();
    	k = in.nextInt();
    	String ans = "NO";
    	if (k <= (n-1)) ans = "YES";
    	
    	System.out.println(ans);
    }
}
