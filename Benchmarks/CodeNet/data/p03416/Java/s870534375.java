import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long ans = IntStream.rangeClosed(scanner.nextInt(), scanner.nextInt())
                .mapToObj(i->String.valueOf(i).toCharArray())
                .filter(ch-> ch[0]==ch[4]&&ch[1]==ch[3])
                .count();
        System.out.println(ans);
        scanner.close();
    }
}
