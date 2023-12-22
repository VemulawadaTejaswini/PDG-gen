import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        double svn = 0;
        boolean never = false;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            double n = 7 * Math.pow(10, i);
            if(svn + n >= Double.MAX_VALUE) {
                break;
            }
            svn += n;
            if ( svn % k == 0 ) {
                System.out.println(i+1);
                never = false;
                break;
            }else {
                never = true;
            }
        }
        if(never == true) {
            System.out.println(-1);
        }
    }
}