import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer s = new StringBuffer(sc.next());
        int q = sc.nextInt();

        boolean isReserve = false;
        for (int i = 0; i < q; i++) {
            int t = sc.nextInt();
            if (t == 1) isReserve = !isReserve;
            else {
                int f = sc.nextInt();
                String c = sc.next();
                if (f == 1 && isReserve) s.append(c);
                else if (f == 1 && !isReserve) s.insert(0, c);
                else if (f == 2 && isReserve) s.insert(0, c);
                else if (f == 2 && !isReserve) s.append(c);
            }
        }
        if (isReserve) System.out.println(s.reverse());
        else System.out.println(s);
    }
}