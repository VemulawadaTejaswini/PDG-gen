import java.util.*;

class Main {

    static public boolean solve(String s) {
        int mid = s.length()/2;
        String lh = s.substring(0, mid);
        String rh = s.substring(mid+1);
        if (! lh.equals(rh)) return false;
        int i = 0, j = lh.length()-1;
        while (i < j) {
            if (lh.charAt(i) != lh.charAt(j)) {
                return false;
            }
            i++; j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        sc.close();

        System.out.println(solve(s) ? "Yes" : "No");

    }
}