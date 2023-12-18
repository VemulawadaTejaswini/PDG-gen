import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a = "Three";
		for(int i = 1; i <= n; i++) {
                if(sc.next().equals("Y")) a = "Four";
		}
        System.out.println(a);
		}	
}
