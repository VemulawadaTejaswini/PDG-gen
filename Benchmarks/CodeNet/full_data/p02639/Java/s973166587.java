import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] x = sc.nextLine().split(" ");

        int ans = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i].equals("0")) ans = i + 1;
        }
        System.out.println(ans);
    }
}
