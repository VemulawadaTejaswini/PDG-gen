import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        for(int i=0; i<=x; i++) {
            int b = x - i;
            if(2*i + 4*b == y) {
                System.out.print("Yes");
                return;
            }
        }
        System.out.print("No");
    }
}