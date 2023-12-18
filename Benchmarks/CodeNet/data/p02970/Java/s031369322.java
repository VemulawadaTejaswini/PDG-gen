import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int d = sc.nextInt();
        int f = d * 2 + 1;

        if (n % f == 0) {
            System.out.println(n / f);
        } else {
            System.out.println(n / f + 1);
        }
	}
}
