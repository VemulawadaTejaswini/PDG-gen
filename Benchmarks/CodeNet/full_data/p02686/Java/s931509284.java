import java.util.Scanner;

public class Main {
    static int n = 0;
    static String[] s = null;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        s = new String[n];
        for(int i=0; i<n; i++) {
            s[i] = in.next();
        }
        int[] close = new int[n];
        int[] open = new int[n];
        for(int i=0; i<n; i++) {
            String s2 = s[i];
            while(true) {
                String s3 = s2.replace("()", "");
                if(s3.equals(s2)) {
                    s[i] = s3;
                    break;
                }
                s2 = s3;
            }
            int mostRightClose = s[i].lastIndexOf(')');
            close[i] = mostRightClose+1;
            
            int mostLeftOpen = s[i].indexOf('(');
            open[i] = 0;
            if(mostLeftOpen>=0) {
                open[i] = s[i].length()-mostLeftOpen;
            }
        }
        int total = 0;
        boolean hasNoOpen = false;
        boolean hasNoClose = false;
        int zeroCount = 0;
        for(int i=0; i<n; i++) {
            total -= close[i];
            total += open[i];
            if(close[i]==0 && open[i]==0) {
                zeroCount++;
            }
            else if(close[i]==0) {
                hasNoClose = true;
            }
            else if(open[i]==0) {
                hasNoOpen = true;
            }
        }
        String ans = "No";
        if(
                (hasNoClose && hasNoOpen)
                || (hasNoClose && zeroCount>0)
                || (hasNoOpen && zeroCount>0)
                || (zeroCount>1)
        ) {
            if(total==0) {
                ans = "Yes";
            }
        }
        System.out.println(ans);
    }
}
