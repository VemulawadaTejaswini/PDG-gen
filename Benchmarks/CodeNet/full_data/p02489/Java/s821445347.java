import java.util.*;

public class AOJ10006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = sc.nextInt();
		int i = 1;
		while(ans != 0){
			System.out.println("Case "+i+": "+ans);
			i++;
			ans = sc.nextInt();
		}
	}

}