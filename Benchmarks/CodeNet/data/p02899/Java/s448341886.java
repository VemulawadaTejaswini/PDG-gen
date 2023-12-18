import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        int[] ord = new int[N];
        int counter = 1;
        while (counter <= N) {
            for (int item : A) {
                if (item == counter) {
                    ord[counter-1] = indexInt(A, item);
                    counter = counter + 1;
                }
            }
        }
        String ans = "";
        for (int i=0; i<N; i++) {
            ans = ans + (ord[i]+1) + " ";
        }
        System.out.print(ans);
    }
    public static int indexInt(int[] list, int elem) {
        int result = list.length;
        for (int i=0; i < list.length; i++) {
            if (list[i] == elem) {
                 result = i;
            }
        }
        return result;
    }
}