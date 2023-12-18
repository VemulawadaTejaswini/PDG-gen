import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a1 = new int[n+1];
        int[] a2 = new int[n];

        for(int i=0; i<n; i++) {
            a1[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            a2[i] = sc.nextInt();
        }

        int a1Sum = 0;
        for(int i=1; i<n; i++) {
            a1Sum += a1[i];
        }

        int a2Sum = 0;
        for(int i=0; i<n-1; i++) {
            a2Sum += a2[i];
        }

        int cnt = 0;
        for(int i=0; i<n; i++) {
            if(a1Sum >= a2Sum) {
                cnt += a1[i];
                a1Sum -= a1[i+1];
                a2Sum -= a2[i];
            } else {
                cnt += a1[i] + a2Sum;
                break;
            }
        }
        System.out.println(cnt+a2[n-1]);
    }
}
