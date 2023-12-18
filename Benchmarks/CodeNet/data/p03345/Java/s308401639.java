import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Long a = in.nextLong();
        Long b = in.nextLong();
        Long c = in.nextLong();

        Long k = in.nextLong();
        if(a == b && b == c) {
            System.out.println(0);
        } else {
            for(Long i=0l; i<k; i++) {
                Long ta = a;
                Long tb = b;
                Long tc = c;

                a = tb + tc;
                b = ta + tc;
                c = ta + tb;
            }

            System.out.println(a-b);
        }
    }
}