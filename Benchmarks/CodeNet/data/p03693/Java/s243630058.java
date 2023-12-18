import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int num = (System.in.read() - '0') * 100;
        System.in.skip(1);
        num += (System.in.read() - '0') * 10;
        System.in.skip(1);
        num += System.in.read() - '0';
        System.out.print(num % 4 == 0 ? "YES" : "NO");
    }
}
