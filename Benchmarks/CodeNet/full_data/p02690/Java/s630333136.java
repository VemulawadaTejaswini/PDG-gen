import java.util.*;

public class Main{

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        new Main().run();
    }

    void run() {

        long x = sc.nextLong();

//        System.out.println((long)Math.pow(1000, 5));
//        System.out.print((long)Math.pow(1001, 5));


        for (int a=-1000; a<=1000; a++) {
            for (int b=-1000; b<=1000; b++) {
                long calc = (long)Math.pow(a, 5) - (long)Math.pow(b, 5);
                if (calc == x) {
                    System.out.print(a + " ");
                    System.out.print(b);
                    return;
                }
            }
        }

    }
}
