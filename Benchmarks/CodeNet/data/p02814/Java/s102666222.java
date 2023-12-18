import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int m  = sc.nextInt();
        List<Integer> aList = new ArrayList<>();
		int ans = 0;
        
		for(int i = 1; i <= n; i++) {
			aList.add(sc.nextInt());
		}
		
		for(int i = 1; i <= m; i++) {
			boolean good = true;
			for(int j = 0; j < aList.size(); j++) {
				int temp = i % aList.get(j);
				if(temp != aList.get(j) * 0.5) {
					good = false;
				}
			}
			if(good) {
				ans++;
			}
		}
					
		System.out.println(ans);
		sc.close();
	}
	
}