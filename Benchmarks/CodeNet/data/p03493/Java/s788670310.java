import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final var count = br.lines().filter(i -> i.equals("1")).count();
        System.out.println(count);

    }
}