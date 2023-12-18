import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n  =  Integer.parseInt(sc.next());
		boolean[] flag = new boolean[1000000000];
		
		for(int i = 0 ; i < n ; i++) {
			flag[i] = false;			
		}
		
		String ans = "YES";
		for(int i = 0 ; i < n ; i++) {
			int tmp  =  Integer.parseInt(sc.next());
			if(flag[tmp]) {
				ans = "NO";
				break;
			}
			flag[tmp] = true;
		}
		
		System.out.println(ans);
	}




}

