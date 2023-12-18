import java.util.HashSet;
import java.util.Scanner;

public class Main {
	

    public static void main(String[] args) {
		
    	Scanner s = new Scanner(System.in);
    	int k = s.nextInt();
    	int a = s.nextInt();
    	int b = s.nextInt();
    	
    	if(Math.abs(a/k-b/k)>=1 || k==1) {
    		System.out.println("OK");
    	}
    	else {
    		System.out.println("NG");
    	}
	}
}