
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int n = Integer.parseInt(sc.nextLine());
            String[] array = sc.nextLine().split(" ");
            long[] a = Stream.of(array).mapToLong(Long::parseLong).toArray();
            long min = Arrays.stream(a).min().getAsLong();
            long max = Arrays.stream(a).max().getAsLong();
            long sum = Arrays.stream(a).sum();
            System.out.println(min + " " + max + " " + sum);
    }    
}

