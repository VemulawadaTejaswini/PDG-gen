import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");
        String reverse = "";
        for (int i = n - 1; i >= 0; i--) {
            reverse += nums[i] + ((i == 0) ? "" : " ");
        }
        System.out.println(reverse);
    }
}