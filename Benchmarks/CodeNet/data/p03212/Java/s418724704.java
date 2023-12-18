import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(f("0",N,0));
    }

    static int f(String S, int N, int ret) {
        if(Integer.parseInt(S) > N) return ret;
        else {
            if(S.contains("7")&&S.contains("5")&&S.contains("3")) ret++;
            ret += f(S+"7", N, 0);
            ret += f(S+"5", N, 0);
            ret += f(S+"3", N, 0);
            return ret;
        }
    }
}