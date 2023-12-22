import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        long sum = 0;
        long min = 0;
        for (int i = 0; i < N; i++) {
            long a = Integer.parseInt(scanner.next());
            if (i==0||a<min){min=a;}
            sum+=a;
        }
        System.out.println(sum - min);
        }
    }
