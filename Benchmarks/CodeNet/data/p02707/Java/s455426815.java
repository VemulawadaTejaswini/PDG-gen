import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n-1];
        int[] b = new int[n];
        for(int i=0; i<n-1; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0; i<=n; i++) {
            for(int j=0; j<n-1; j++) {
                if(a[j] == i+1) b[i]++;
            }
        }
        for(int i=0; i<n; i++) {
            System.out.println(b[i]);
        }
    }
}