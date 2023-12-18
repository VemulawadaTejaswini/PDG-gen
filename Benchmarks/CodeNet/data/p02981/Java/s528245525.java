import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Collections;
        import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        ArrayList<Integer> stuff = new ArrayList<Integer>();
        for (int i = a; i <= b; i++) {
            stuff.add(i % 2019);
            if (i % 2019 == 0) {
                System.out.print(0);
                System.exit(0);
            }
        }
        Collections.sort(stuff);
        int m = stuff.get(0) * stuff.get(1);
        int n = stuff.get(stuff.size() - 1) * stuff.get(stuff.size() - 2);
        if (m > n) {
            System.out.print(n % 2019);
        }else{
            System.out.print(m % 2019);
        }

    }
}