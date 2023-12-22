import java.util.Scanner;
import java.util.Stack;

public class Main {

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] a = new int[count];
        for (int i = 0; i < count; i++) {
            a[i] = sc.nextInt();
        }

        a = shellSort(a);
        System.out.println(Main.count);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static int[] shellSort(int[] a) {
        Stack<Integer> gaps = new Stack<>();
        int h = 1;
        for (int i = 0; h < a.length && i < 100; h = h * 3 + 1, i++) {
            gaps.push(h);
        }
        System.out.println(gaps.size());
        StringBuilder sb = new StringBuilder();
        while (!gaps.isEmpty()) {
            sb.append(gaps.peek()).append(" ");
            a = insertionSort(a, gaps.pop());
        }
        System.out.println(sb);
        return a;
    }

    private static int[] insertionSort(int[] a, int gap) {
        for (int i = gap; i < a.length; i++) {
            int target = a[i];
            int j = i - gap;
            while (j >= 0 && a[j] > target) {
                a[j + gap] = a[j];
                j -= gap;
                count++;
            }
            a[j + gap] = target;
        }
        return a;
    }
}