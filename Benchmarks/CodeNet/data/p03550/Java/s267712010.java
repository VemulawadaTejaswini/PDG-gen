import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int[] card = new int[a[0]];
        for (int i = 0; i < a[0]; i++) {
            card[i] = sc.nextInt();
        }
        System.out.println(Math.max(
            Math.abs(card[card.length - 1] - a[2]),
            Math.abs(card[card.length - 1] - card[card.length - 2])));
    }
}
