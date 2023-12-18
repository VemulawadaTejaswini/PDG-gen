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
        int sum = list.stream().mapToInt(i -> i).sum();
        int min =  sum % (4 * m) == 0 ? sum % (4 * m) :sum % (4 * m) + 1;
        if(list.stream().filter(f -> f >= min).count() >= m){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
