import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long k = Long.parseLong(sc.next());

        long tmp = n;

        if(k == 1){
            System.out.println("0");
        }else {

            while (true) {
                long hoge = Math.abs(tmp - k);
                if (hoge <= tmp) {
                    tmp = hoge;
                } else {
                    break;
                }
            }
        }
        System.out.println(tmp);
    }
}
