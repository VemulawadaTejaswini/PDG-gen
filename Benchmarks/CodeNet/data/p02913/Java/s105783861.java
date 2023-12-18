import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S_tmp = sc.next();
        StringBuilder S = new StringBuilder(S_tmp);
        char[] str = new char[N];
        for (int i=0;i<N;i++) {
            str[i] = S.charAt(i);
        }
        int ans = 0;
        int left = 0;
        int right = N-1;
        while (left<=right) {
            int mid = (right+left)/2;
            int flag = 0;
            for (int i=0;i<N-mid;i++) {
                String S_1 = S.substring(i, i+mid);
                if (S.substring(i+mid).contains(S_1)) {
                    flag=1;
                }
            }
            if (flag==1) {
                ans=mid;
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        System.out.println(ans);
    }
}