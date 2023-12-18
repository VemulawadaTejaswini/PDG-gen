import java.util.*;

public class Main {
    public void main(Scanner sc) {
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	long k = sc.nextLong();
    	
    	System.out.println((k % 2 == 0) ? a - b : b - a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
