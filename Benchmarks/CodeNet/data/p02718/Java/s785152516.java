import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
            sum += a[i];
        }
        int minVote = (int)Math.ceil(sum / 4.0 / m);
        int c = 0;
        for(int i=0; i<n; i++) {
            if(a[i]>=minVote) {
                c++;
            }
        }
        System.out.println(c>=m ? "Yes" : "No");
    }
}
