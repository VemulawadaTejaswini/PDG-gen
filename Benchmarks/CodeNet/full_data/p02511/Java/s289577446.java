import java.util.Scanner;


public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            StringBuilder mes = new StringBuilder(sc.next());
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt() - 1;
                b[i] = sc.nextInt() - 1;
            }
            for (int i = n - 1; i >= 0; i--) {
                int diff = b[i] - a[i];

                char ac = mes.charAt(a[i]);
                char bc = mes.charAt(b[i]);

                ac = (char) (((ac - 'a') + diff) % 26 + 'a');
                bc = (char) (((bc - 'a') + diff) % 26 + 'a');

                mes.setCharAt(a[i], bc);
                mes.setCharAt(b[i], ac);
            }
            System.out.println(mes);
        }
    }

}