import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 
/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        List<Double> values = new ArrayList<Double>();
        String[] valueString = scanner.nextLine().split(" ");
        Stream<String> stream = Arrays.stream(valueString);
        values = stream.map(v -> Double.parseDouble(v)).collect(Collectors.toList());
 //        for (int i = 0 ; i < num ; i++) {
//            values.add(scanner.nextDouble());
//        }
        Collections.sort(values);
        Double ans = values.stream().reduce(values.get(0), (val, elm) -> (val + elm)/2);
        System.out.println(ans);
//        for(int i = 0; i < num-1 ; i++) {
//            Double v = (values.get(i) + values.get(i+1))/2;
//            values.set(i+1, v);
//        }
//        System.out.println( values.get(num-1));
    
    
        
    }
}