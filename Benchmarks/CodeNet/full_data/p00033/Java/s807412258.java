import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int[] arr = new int[10];
            for (int j = 0; j < 10; j++) {
                arr[j] = sc.nextInt();
            }
            Stack<Integer> st1 = new Stack<>(), st2 = new Stack<>();
            String res = solve(arr, 0, st1, st2) ? "YES" : "NO";
            System.out.println(res);
        }
    }

    public static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public static boolean solve(int[] arr, int cur, Stack<Integer> st1, Stack<Integer> st2) {
        if (cur >= arr.length) return true;
        int num = arr[cur];
        boolean res = false;
        if (st1.empty() || num > st1.peek()) {
            st1.push(num);
            res = solve(arr, cur + 1, st1, st2);
            if (res) return true;
            st1.pop();

        } else if(st2.empty() ||num>st2.peek()){
            st2.push(num);
            res = solve(arr, cur+1, st1,st2);
            if(res) return true;
            st2.pop();
        }
        return false;

    }

}
