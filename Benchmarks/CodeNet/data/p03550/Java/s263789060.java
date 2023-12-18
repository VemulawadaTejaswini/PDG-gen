import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int[] card = new int[a[0]];
        for (int i = 0; i < a[0]; i++) {
            card[i] = sc.nextInt();
        }
        int max = Math.max(Math.abs(a[1] - card[card.length - 1]), Math.abs(a[2] - card[card.length - 1]));
        int last = card[card.length - 1];
        for (int i = card.length - 2; i >= 0; i--) {
            if (Math.abs(last - card[i]) > max) {
                max = Math.abs(last - card[i]);
            }
        }
        System.out.println(max);
    }
}
