import java.util.Scanner;

public class Main {
    static final int COLORS = 3;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        long c = 1;
        int[] h = new int[COLORS];
        for(int i=0; i<COLORS; i++) {
            h[i] = -1;
        }
        for(int i=0; i<n; i++) {
            int temp = 0;
            boolean added = false;
            for(int j=0; j<COLORS; j++) {
                if(h[j] == a[i]-1) {
                    temp++;
                    if(!added) {
                        added = true;
                        h[j] = a[i];
                    }
                }
            }
            c *= temp;
            if(temp == 0) {
                break;
            }
        }

        System.out.println(c % 1000000007);
    }
}
