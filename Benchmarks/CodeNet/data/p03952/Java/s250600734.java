import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();

        if (N==2) {
            if (x==2) {
                System.out.println("Yes");
                for (int i=1;i<=3;i++) {
                    System.out.println(i);
                }
            } else {
                System.out.println("No");
            }
            return;
        }
        if (N==3) {
            if (x==2) {
                System.out.println("Yes");
                System.out.println(3);
                System.out.println(1);
                System.out.println(2);
                System.out.println(4);
                System.out.println(5);
            } else if (x==3) {
                System.out.println("Yes");
                for (int i=1;i<=5;i++) {
                    System.out.println(i);
                }
            } else if (x==4) {
                System.out.println("Yes");
                System.out.println(3);
                System.out.println(4);
                System.out.println(5);
                System.out.println(1);
                System.out.println(2);
            } else {
                System.out.println("No");
            }
            return;
        }
        if (3<=x && x<=2*N-1-2) {
            System.out.println("Yes");
            ArrayList<Integer> before = new ArrayList<Integer>();
            ArrayList<Integer> after = new ArrayList<Integer>();
            int cnt = 0;
            for (int i=1;i<=2*N-1;i++) {
                if (i==x-1 || i==x || i==x+1 || i==1 || i==2*N-1) continue;
                cnt++;
                if (cnt<=N-3) {
                    before.add(i);
                } else {
                    after.add(i);
                }
            }
            for (int i=0;i<N-3;i++) {
                System.out.println(before.get(i));
            }
            System.out.println(2*N-1);
            System.out.println(x-1);
            System.out.println(x);
            System.out.println(x+1);
            System.out.println(1);
            for (int i=0;i<N-3;i++) {
                System.out.println(after.get(i));
            }
        } else {
            System.out.println("No");
        }
    }
}