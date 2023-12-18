import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputN = Integer.parseInt(sc.next());
        sc.nextLine();
        List<Integer> arr = Arrays.asList(sc.nextLine().split(" ")).stream().map( (String x) -> Integer.parseInt(x)).collect(Collectors.toList());

        int count = 0;
        int sum = arr.stream().mapToInt(x ->{
            char[] str = new StringBuffer(Integer.toBinaryString(x)).reverse().toString().toCharArray();
            int cnt = 0;
            for(int i = 0; i<str.length; i++ ) {
                if (str[i] == '0') {
                    cnt++;
                } else {
                    break;
                }
            }
            return cnt;
        }).sum();
        System.out.println(sum);

    }
