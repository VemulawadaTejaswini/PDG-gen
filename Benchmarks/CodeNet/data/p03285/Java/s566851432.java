import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int a = 0;
        boolean just = false;
        Scanner scan = new Scanner(System.in);

        a = Integer.parseInt(scan.next());


        for (int donuts = 0; donuts * 4 <= a; donuts++) {
                for (int cake = 0; cake * 7 <= a; cake++) {
                    int total = (4 * donuts) + (7 * cake);
                    if (total == a) {
                        just = true;
                    }
            }
        }

        System.out.println(just ? "YES" : "NO");
    }
}
