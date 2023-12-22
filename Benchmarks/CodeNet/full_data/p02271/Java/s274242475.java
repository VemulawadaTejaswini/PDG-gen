import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(input[i]);
        }

        int q = Integer.parseInt(br.readLine());
        input = br.readLine().split(" ");
        int target;

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < q; i++) {
            target = Integer.parseInt(input[i]);

            sb.append(solve(a, target, 0) ? "yes" : "no").append("\n");
        }

        System.out.print(sb.toString());
    }

    public static boolean solve(int[] arr, int target, int start) {
        if (target == 0) return true;
        else if (start == arr.length) return false;
        else return solve(arr, target, start + 1) || solve(arr, target - arr[start], start + 1);
    }
}