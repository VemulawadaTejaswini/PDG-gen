import java.util.*;

public class Main {

    public static StringBuilder output = new StringBuilder();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int arr[] = new int[10];
        Arrays.fill(arr, 1);
        for (int i = 0; i < k; i++) {
            int c = in.nextInt();
            arr[c]--;
        }
        Solver solver = new Solver();
        solver.solve(arr, n);
        System.out.println(output);
    }

}

class Solver {
    public void solve(int arr[], int n) {
        String a = "";
        int amt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && i > 0) {
                amt = n * i;
                break;
            }
        }
        C.output.append(amt);

    }
}