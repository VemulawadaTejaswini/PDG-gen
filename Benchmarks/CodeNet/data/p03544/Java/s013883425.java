import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	long Ls = 2;
    	long Lb = 1;
    	for (int i = 2; i <= N; i++) {
    		long tmp = Ls + Lb;
    		Ls = Lb;
    		Lb = tmp;
    	}
    	System.out.println(Lb);
    }
}