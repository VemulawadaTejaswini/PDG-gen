import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        ArrayList<Apple> apples = new ArrayList<>(a + b + c);

        for (int i = 0; i < a; i++) {
            apples.add(new Apple(sc.nextInt(), Apple.RED));
        }
        for (int i = 0; i < b; i++) {
            apples.add(new Apple(sc.nextInt(), Apple.BLUE));
        }
        for (int i = 0; i < c; i++) {
            apples.add(new Apple(sc.nextInt(), Apple.NONE));
        }

        Collections.sort(apples, (ap1, ap2) -> {
            return -Long.compare(ap1.tasty, ap2.tasty);
        });

        int red = 0;
        int blue = 0;
        int none = 0;
        long totalTasty = 0;

        for (Apple apple : apples) {
            switch (apple.color) {
                case Apple.RED:
                    if (red < x) {
                        totalTasty += apple.tasty;
                        red++;
                    }
                    break;

                case Apple.BLUE:
                    if (blue < x) {
                        totalTasty += apple.tasty;
                        blue++;
                    }
                    break;

                case Apple.NONE:
                    totalTasty += apple.tasty;
                    none++;
            }
            if(red + blue + none >= x+y){
                break;
            }
        }

        System.out.println(totalTasty);
    }
}

class Apple {
    static final int RED = 0;
    static final int BLUE = 1;
    static final int NONE = 2;

    public long tasty;
    public int color;

    Apple(long tasty, int color) {
        this.tasty = tasty;
        this.color = color;
    }
}
