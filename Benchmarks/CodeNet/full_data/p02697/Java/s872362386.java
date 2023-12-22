import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int mid = (int)Math.floor(n/2.0);
        for(int i=0; i<m; i++) {
            System.out.print(mid-i);
            System.out.print(' ');
            System.out.println(mid+1+i);
        }
    }
}
