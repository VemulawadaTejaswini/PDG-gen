import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
    	new B().doIt();
    }
    class B{
    	void doIt(){
    		int n = sc.nextInt();
    		int m = sc.nextInt();
    		String a[] = new String [n];
    		for(int i = 0;i < n;i++){
    			a[i] = sc.next();
    		}
    		Arrays.sort(a);
    		for(int i = 0;i < n;i++){
    			System.out.print(a[i]);
    		}
    		System.out.println();
    	}
    }
}