import java.util.Scanner;

public class Main {
    public static int s[];
    public static int n;
    public static int count = 0;
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        s = new int[n];
        int right = n - 1;
        for(int i = 0; i < n; i++){
            s[i] = scan.nextInt();
        }
        int q = scan.nextInt();
        for(int i = 0; i < q; i++){
            int m = scan.nextInt();
            solve(m, right, 0);
        }

        System.out.println(count);
        scan.close();
    }

    public static void solve(int key, int right, int left){
        int m = (left + right) / 2;
        while(left <= right) {
            if (s[m] == key) {
                count = count + 1;
                return;
            } else if (s[m] > key) {
                right = m - 1;
            } else {
                 left = m + 1;
            }
            m = (left + right) / 2;
        }
    }
}
