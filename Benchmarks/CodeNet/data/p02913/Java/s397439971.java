import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        char[] str = new char[N];
        for (int i=0;i<N;i++) {
            str[i] = S.charAt(i);
        }
        int ans = 0;
        for (int leng=1;leng<N;leng++) {
            int flag = 0;
            for (int i=0;i<N-leng;i++) {
                String S_1 = S.substring(i, i+leng);
                if (S.substring(i+leng).contains(S_1)) {
                    flag=1;
                }
            }
            if (flag==1) {
                ans=leng;
            }
        }
        System.out.println(ans);
    }
}