import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author shengboxu
 */

public class Main {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
    
        System.out.println(Stream.of(str.split(""))
                .map(e -> e.compareTo("9") == 0 ? "1" : "9")
                .collect(Collectors.joining("")));
    }
}
