import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int cards[] = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        // sort cards
        for (int i = 0; i < n; i++) {
            int min = cards[i];
            for (int j = i+1; j < n; j++) {
                if (min > cards[j]) {
                    cards[i] = cards[j];
                    cards[j] = min;
                    min = cards[i];
                }
            }
        }

        int b[] = new int[m];
        int c[] = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        // sort b, c
        for (int i = 0; i < m; i++) {
            int max = c[i];
            int num = b[i];
            for (int j = i+1; j < m; j++) {
                if (max < c[j]) {
                    c[i] = c[j];
                    c[j] = max;
                    max = c[i];
                    b[i] = b[j];
                    b[j] = num;
                    num = b[i];
                }
            }
        }

        int d[] = new int[n];

        int index1 = 0;
        int index2 = 0;
        while (index1 < n && index2 < m) {
            for (int i = 0; i < b[index2]; i++) {
                if (index1 < n) {
                    d[index1] = c[index2];
                    index1++;
                }
            }
            index2++;
        }
        
        int index3 = 0;
        while (index3 < n && cards[index3] < d[index3]) {
            cards[index3] = d[index3];
            index3++;
        }

        long result = 0;
        for (int i = 0; i < n; i++) {
            result = result + cards[i];
        }

        System.out.println(result);
	}
}