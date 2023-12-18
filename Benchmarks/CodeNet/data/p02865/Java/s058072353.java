import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        sc.close();

        int cnt = 0;
        int j;
        for (int i=1; i<N; i++) {
            j = N -i;
            if (j>0 && i<j) {
                cnt++;
            } else {
                break;
            }
        }
        System.out.println(cnt);
    }
}