import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] numbers = scanner.nextLine().split(" ");
        List<Integer> result = Arrays.asList(numbers)
            .stream()
            .map(i -> Integer.parseInt(i))
            .sorted()
            .collect(Collectors.toList());
        
        System.out.println(result.get(0) + " " + result.get(1) + " " + result.get(2));
    } 
}
