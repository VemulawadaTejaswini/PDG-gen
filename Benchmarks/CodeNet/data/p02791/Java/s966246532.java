import java.util.ArrayList;
import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> numList = new ArrayList<>();
		int ans = 0;
		
		for(int i = 0; i < N; i++) {
			numList.add(sc.nextInt());
		}
		
		for(int i = 0; i < N; i++) {
			boolean matchCondition = true;
			for(int j = 0; j < i; j++) {
				if(numList.get(j) < numList.get(i)) {
					matchCondition = false;
					break;
				}
			}
			
			if(matchCondition) {
				ans++;
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
}