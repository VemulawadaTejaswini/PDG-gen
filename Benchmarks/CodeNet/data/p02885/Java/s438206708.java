import java.util.*;

public class Main {
    public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	
	int a = in.nextInt();
	int b = in.nextInt();
	
	System.out.println(a>2*b ? a-2*b : 0);
    }
}
