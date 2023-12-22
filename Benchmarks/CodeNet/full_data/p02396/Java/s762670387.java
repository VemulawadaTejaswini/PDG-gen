import java.util.Scanner;
public class Main {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int a, c = 0;
	        while(true) {
	            a = sc.nextInt();
	            if(a == 0) break;
	            System.out.println("Case " + (++c) + ": " + a);
	        }
	    }
	}
