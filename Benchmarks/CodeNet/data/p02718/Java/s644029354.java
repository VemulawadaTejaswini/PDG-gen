import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list = IntStream.range(0, n).mapToObj(i -> sc.nextInt()).collect(Collectors.toList());
        int min = list.stream().mapToInt(i -> i).sum() / (4 * m);
        if(list.stream().filter(f -> f >= min).count() >= m){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
