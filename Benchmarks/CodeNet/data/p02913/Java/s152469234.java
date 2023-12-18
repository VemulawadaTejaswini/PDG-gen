import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int l = 0;
        int r = (int)Math.floor(n/2.0);
        while(l<r) {
            int m = (l+r)/2;
            if(found(n, s, m)) {
                if(l==r-1 && l==m) {
                    if(found(n, s, m+1)) {
                        l = r;
                    }
                    else {
                        r = l;
                    }
                }
                else {
                    l = m;
                }
            }
            else {
                r = m;
            }
        }
        System.out.println(l);
    }
    private static boolean found(int n, String s, int length) {
        if(length<1) {
            return false;
        }
        boolean found = false;
        for(int i=0; i<n-length; i++) {
            String sub = s.substring(i, i+length);
            if(s.indexOf(sub, i+length) >= 0) {
                found = true;
                break;
            }
        }
        return found;
    }
}
