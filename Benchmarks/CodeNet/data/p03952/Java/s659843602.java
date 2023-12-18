import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();

        if (2<=x && x<=2*N-1-1) {
            System.out.println("Yes");
            ArrayList<Integer> before = new ArrayList<Integer>();
            ArrayList<Integer> after = new ArrayList<Integer>();
            int cnt = 0;
            for (int i=1;i<=2*N-1;i++) {
                if (i==x-1 || i==x || i==x+1) continue;
                cnt++;
                if (cnt<=N-2) {
                    before.add(i);
                } else {
                    after.add(i);
                }
            }
            for (int i=0;i<N-2;i++) {
                System.out.println(before.get(i));
            }
            System.out.println(x-1);
            System.out.println(x);
            System.out.println(x+1);
            for (int i=0;i<N-2;i++) {
                System.out.println(after.get(i));
            }
        } else {
            System.out.println("No");
        }
    }
}