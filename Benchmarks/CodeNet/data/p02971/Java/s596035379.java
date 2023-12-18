import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());

        Integer[] a = new Integer[n];
        for(int i =0; i < n; i++) {
            a[i] = Integer.parseInt(scanner.next());
        }

        int max = a[0];
        for(int i = 0; i< n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                max = Math.max(max, a[j]);
            }
            System.out.println(max);
            max = 0;
        }

    }
}
