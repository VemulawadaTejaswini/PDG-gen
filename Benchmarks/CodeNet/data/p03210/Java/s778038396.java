import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        long A = sc.nextLong();
        
        if (A == 3 || A == 5 || A == 7) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
    }

}	