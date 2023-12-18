import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[n+1];
        int b[] = new int[n];

        for (int i = 0; i < n+1; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (b[i] <= a[i]) {
                sum += b[i];
            } else {
                if (b[i] <= a[i] + a[i+1]) {
                    sum += b[i];
                } else {
                    sum += a[i] + a[i+1];
                }
                a[i+1] = b[i] - a[i];
                if (a[i+1] < 0) {
                    a[i+1] = 0;
                }
            }
        }

        System.out.println(sum);
	}
}
