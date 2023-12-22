import java.util.Scanner;

public class Main {
    Double A,B,N;

    public Main() {
        Scanner scanner = new Scanner(System.in);
        A = Double.parseDouble(scanner.next());
        B = Double.parseDouble(scanner.next());
        N = Double.parseDouble(scanner.next());

        double max = Integer.MIN_VALUE;
        for(long i=0;i<=N;i++){
            max = Math.max(max, Math.floor(A*i/B) - A*Math.floor(i/B));
        }

        System.out.println((int)max);
    }

    public static void main(String[] args) {
        new Main();
    }
}
