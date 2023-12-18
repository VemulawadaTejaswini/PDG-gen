import java.io.*;

class EvenPairs {
    public static void main(String[] args)throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        int m = Integer.parseInt(in.readLine());

        int even = 0;
        int odd = 0;
        for (int i = 0; i < n ; i++) {
            even += i;
        }
        for (int i = 0; i < m ; i++) {
            odd += i;
        }

        System.out.println(even+odd);
    }
}