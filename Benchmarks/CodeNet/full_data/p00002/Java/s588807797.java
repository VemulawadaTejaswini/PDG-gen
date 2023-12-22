import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 200; i++) {
            int sum;
            int[] n = new int[2];
            n[0] = sc.nextInt();
            n[1] = sc.nextInt();
            sum = n[0] + n[1];
            String s;
            s = String.valueOf(sum);
            System.out.println(s.length());
        }

    }
}