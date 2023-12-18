import java.util.*;

public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int[] map  = new int[N];
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextInt();
		}
		
		int[] boxs = new int[N];
		for (int i = map.length-1; i >= 0; i--) {
			int a = map[i];
			int sum = 0;
			for (int j = (i+1); j < map.length; j += (i+1)) {
				sum += boxs[j-1];
			}
			
			if (a != (sum % 2)) {
				boxs[i] = 1;
			}
		}
		
		int sum = 0;
		String ans = "";
		for (int i = 0; i < N; i++) {
			if (boxs[i] == 1) {
				ans += (i+1);
				ans += " ";
				sum++;
			}
		}
		
		System.out.println(sum);
		
		if (!ans.isEmpty()) {
			System.out.println(ans.trim());
		}
		
    }
}