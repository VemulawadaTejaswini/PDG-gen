import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.next().split("", 0);
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += (Integer.parseInt(a[i]) == 1) ? 1 : 0;
        }

        System.out.println(result);
    }
}