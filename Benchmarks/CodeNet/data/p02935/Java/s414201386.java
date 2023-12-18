import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntToDoubleFunction;
 
/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num = scanner.nextInt();
        List<Double> values = new ArrayList<Double>();
        for (int i = 0 ; i < num ; i++) {
            values.add(scanner.nextDouble());
        }
        Collections.sort(values);
        values.stream().peek(v -> {
            if(values.size() > 1) {
            Double value = (values.get(0) + values.get(1)) / 2 ;
            
            values.remove(0);
            values.remove(1);
            values.add(0, value);
            }
        });
        System.out.println( values.get(0));
    
        
    }
}