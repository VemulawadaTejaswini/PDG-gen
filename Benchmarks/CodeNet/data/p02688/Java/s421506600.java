import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int sunuke[] = new int[n];
        for(int i=0; i<n; i++) {
            sunuke[i] = 0;
        }

        for(int i=0; i<k; i++) {
            int a = sc.nextInt();
            for(int j=0; j<a; j++) {
                int b = sc.nextInt() - 1;
                sunuke[b] = 1;
            }
        }

        int count = 0;
        for(int i=0; i<n; i++) {
            if(sunuke[i] == 0) count++;
        }

        System.out.println(count);
	}
}