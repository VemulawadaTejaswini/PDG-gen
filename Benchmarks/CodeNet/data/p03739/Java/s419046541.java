import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        boolean isPositive = false;
        if(a[0] > 0) {
            isPositive = true;
        }
        int cnt = 0;
        int tmp = a[0];
        for(int i=0; i<n; i++) {
            if(i+1 < n) {
                if(isPositive) {
                    while(tmp+a[i+1] >= 0) {
                        a[i+1]--;
                        cnt++;
                    }
                } else {
                    while(tmp+a[i+1] <= 0) {
                        a[i+1]++;
                        cnt++;
                    }
                }
                if(isPositive) {
                    isPositive = false;
                } else {
                    isPositive = true;
                }
                tmp += a[i+1];
            }
        }
        System.out.println(cnt);
    }
}
