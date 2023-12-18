import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int count = 1;
        int h[] = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int max = h[0];

        for (int i = 1; i < n; i++) {
            if (max <= h[i]) {
                count++;
                max = h[i];
            }
        }

        System.out.println(count);
	}
}
