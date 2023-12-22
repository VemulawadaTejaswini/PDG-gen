import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int[] box = new int[n];
		for(int i = 0 ; i < n ; i++) {
			box[i] = Integer.parseInt(sc.next());
		}

        Arrays.sort(box);

        int ans = 0;
        for(int i = 0 ; i < k ; i++) {
        	ans += box[i];
        }
        System.out.println(ans);
	}
}


