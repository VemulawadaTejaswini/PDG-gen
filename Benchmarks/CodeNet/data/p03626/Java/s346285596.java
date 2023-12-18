import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S1 = sc.next();
        String S2 = sc.next();
        int mod = 1_000_000_007;
        long ans = 1;
        int flag = -1; // flag==0: yoko, flag==1: tate
        for (int i=0;i<N;i++) {
            if (i==0) {
                if (i!=N-1 && S1.charAt(i)==S1.charAt(i+1)) {  //yoko
                    ans = 6;
                    i++;
                    flag=0;
                } else {
                    ans = 3;
                    flag=1;
                }
            }
            if (flag==0) { // yoko
                if (i!=N-1 && S1.charAt(i)==S1.charAt(i+1)) { // yoko
                    ans = ans*3%mod;
                    i++;
                } else { // tate
                    flag=1;
                }
            } else { // tate
                if (i!=N-1 && S1.charAt(i)==S1.charAt(i+1)) { // yoko
                    ans = ans*2%mod;
                    flag=0;
                    i++;
                } else { // yoko
                    ans = ans*2%mod
                }
            }
        }
        System.out.println(ans);
    }
}