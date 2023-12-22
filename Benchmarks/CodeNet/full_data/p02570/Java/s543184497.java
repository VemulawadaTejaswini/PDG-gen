import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
      	int T = sc.nextInt();
      	int S = sc.nextInt();
      	if(D <= S*T) System.out.println("Yes");
      	else System.out.println("No");
	}
}