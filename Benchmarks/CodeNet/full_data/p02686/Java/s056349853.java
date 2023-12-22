import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int left_zero = 0;
        int right_zero = 0;
        int double_zero = 0;
        long left_sum = 0;
        long right_sum = 0;
        ArrayList<int[]> l_r = new ArrayList<int[]>();
        ArrayList<int[]> ll = new ArrayList<int[]>();
        ArrayList<int[]> rr = new ArrayList<int[]>();
        for (int i=0;i<N;i++) {
            String S = sc.next();
            int len = S.length();
            char[] c = S.toCharArray();
            int left = 0;
            int right = 0;
            for (int j=0;j<len;j++) {
                if (c[j] == '(') {
                    left++;
                } else { // c[i] == ')'
                    if (left>0) left--;
                    else right++;
                }
            }
            if (left == 0 && right == 0) double_zero++;
            else if (left == 0) left_zero++;
            else if (right == 0) right_zero++;
            left_sum += left;
            right_sum += right;
            // System.out.println("left, right: "+left+" "+right);
            int[] tmp = {left, right};
            l_r.add(tmp);
            if (left-right >=0 ) ll.add(tmp);
            if (right-left >=0 ) rr.add(tmp);
        }

        boolean fff = true;
        if (left_sum != right_sum) fff = false;
        int left_tmp = 0;
        Collections.sort(ll, (o1, o2)->Integer.compare(o1[1], o2[1]));
        for (int i=0;i<ll.size();i++) {
            left_tmp -= ll.get(i)[1];
            if (left_tmp < 0) fff = false;
            left_tmp += ll.get(i)[0];
        }

        int right_tmp = 0;
        Collections.sort(rr, (o1, o2)->Integer.compare(o1[0], o2[0]));
        for (int i=0;i<rr.size();i++) {
            right_tmp -= rr.get(i)[0];
            if (right_tmp < 0) fff = false;
            right_tmp += rr.get(i)[1];
        }


        if (fff) System.out.println("Yes");
        else System.out.println("No");
        // System.out.println("left_sum, right_sum: "+left_sum+" "+right_sum);
        // System.out.println(left_zero+" "+right_zero+" "+double_zero);

        // if (N == 1) {
        //     if (double_zero == 1) System.out.println("Yes");
        //     else System.out.println("No");
        //     return;
        // }

        // if ((left_sum == right_sum) && (
        //     double_zero >= 2 ||
        //     (left_zero >= 1 && right_zero >= 1) ||
        //     (left_zero >= 1 && double_zero >= 1) ||
        //     (double_zero >= 1 && right_zero >= 1))
        //     ) {
        //     System.out.println("Yes");
        // } else {
        //     System.out.println("No");
        // }
    }
}