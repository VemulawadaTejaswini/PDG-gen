import java.util.*;

public class Main{

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        new Main().run();
    }

    void run() {

        long x = sc.nextLong();


        for (int a=-100; a<=100; a++) {
            for (int b=-100; b<=100; b++) {
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
