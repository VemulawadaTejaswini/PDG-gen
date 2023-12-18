import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int q = scan.nextInt();
        int r = scan.nextInt();
        System.out.println(p + q + r - Math.max(p, Math.max(q, r)));
    }
}