import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		
		int ans = 0;
		int kuchi = 1;
		
		while(kuchi < B) {
			kuchi += A-1;
			ans++;
			//System.out.println(kuchi);
			//System.out.println(ans);
			//System.out.println("---");
		}
		
		System.out.println(ans);
		
		
	}

}
