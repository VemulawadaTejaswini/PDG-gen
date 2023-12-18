import java.util.*;

public class Main {

    public static boolean isBetween(int ac, int l, int r) {
        if (ac >= l && ac+1 <= r) {
            return true;
        }
        return false;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l1 = sc.nextLine();
        String[] l1Words = l1.split(" ");
        int n = Integer.parseInt(l1Words[0]);
        int q = Integer.parseInt(l1Words[1]);

      	String s = sc.nextLine();

        int[] sum = new int[s.length()];
        sum[0] = 0;
        for (int i =1; i<s.length(); i++) {
            if (s.charAt(i-1) == 'A' && s.charAt(i) == 'C') {
                sum[i] = sum[i-1] + 1;
            }
            else {
                sum[i] = sum[i-1];
            }
        }
                               
        for (int i =0; i<q; i++) {
            String l2 = sc.nextLine();
            String[] l2Words = l2.split(" ");
            int l = Integer.parseInt(l2Words[0]);
            int r = Integer.parseInt(l2Words[1]);

            int result = sum[r-1] - sum[l-1];
            System.out.println(result);
        }
        sc.close();
    }


}