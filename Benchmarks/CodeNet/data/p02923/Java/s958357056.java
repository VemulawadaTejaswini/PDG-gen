import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int h[] = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int max = 0;
        int dummy = 0;

        for (int i = 0; i < n-1; i++) {
            if (h[i] >= h[i+1]) {
                dummy++;
            } else {
                if (max < dummy) {
                    max = dummy;
                    dummy = 0;
                }
            }
        }

        if (max < dummy) {
            max = dummy;
        }
        System.out.println(max);
	}
}
