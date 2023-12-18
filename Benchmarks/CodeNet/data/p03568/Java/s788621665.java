import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println(enumerate(a, 0));
    }

    private static int enumerate(int[] a, int index){
        if (index == a.length - 1) return a[index] % 2 == 0?1:2;
        int even = a[index] % 2 == 0?1:2;
        return even*(int) Math.pow(3, a.length - index - 1) + (3 - even)*enumerate(a, index + 1);
    }
}
