import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();
        ArrayList<Integer> sum = new ArrayList<Integer>();
        int f = Integer.parseInt(S.substring(0, 1));
        int cnt = f > 0 ? 1 : -1;
        sum.add(0);

        for (int i = 1; i < S.length(); i++) {
            if (cnt > 0) {
                if (S.charAt(i) == '1') {
                    cnt++;
                } else {
                    sum.add(cnt);
                    cnt = -1;
                }
            } else {
                if (S.charAt(i) == '0') {
                    cnt--;
                } else {
                    sum.add(cnt);
                    cnt = 1;
                }
            }
        }
        sum.add(cnt);
        sum.add(0);

        if(sum.get(1)>0)sum.remove(0);


        // System.out.println(Arrays.toString(sum.toArray()));
        int max=0;
        for (int i = 0; i < sum.size(); i+=2) {
            int val = 0;
            // int magic = 0;
            for (int j = i; j <= i + K * 2 && j<sum.size(); j++) {
                // System.out.println(i + K * 2);
                val += Math.abs(sum.get(j));
            }
            max=Math.max(max,val);
        }

        System.out.println(max);
    }
}