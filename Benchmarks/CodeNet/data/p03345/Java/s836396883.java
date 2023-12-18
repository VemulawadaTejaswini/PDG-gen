import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Long a = in.nextLong();
        Long b = in.nextLong();
        Long c = in.nextLong();
        Long k = in.nextLong();

        if(k % 2 == 0) {
            System.out.println(a-b);
        } else {
            System.out.println(b-a);
        }
    }
}