import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int k = sc.nextInt();
        //        ArrayList<Integer> list = new ArrayList<Integer>();
        //
        //        for (int i = 0; i < n; i++) {
        //            list.add(sc.nextInt());
        //        }

        sc.close();

        int tmp = (int) Math.ceil(n / 2);

        if (tmp >= k) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
