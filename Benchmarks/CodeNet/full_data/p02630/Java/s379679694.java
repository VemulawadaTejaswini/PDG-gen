
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();

        //store in to hashmap
        for(int count = 0; count < len; count++ ){
            int val = scanner.nextInt();
            map.put( val, map.getOrDefault(val, 0) + 1 );
        }

        int total = 0;//get the total sum
        for(int key: map.keySet() ){
            total += map.get(key) * key;
        }

        int queries = scanner.nextInt();

        //use the queries
        for(int count = 0; count < queries; count++ ){
            int first = scanner.nextInt();
            int second = scanner.nextInt();

            if( map.containsKey(first) ){
                //get the count before
                int val = map.get(first);
                //totol sum before
                int sum = val * first;
                map.remove(first);
                //if there are already second number exist with some count
                map.put(second, map.getOrDefault( second, 0 ) + val );
                
                //subtract the old sum
                total -= sum;
                //add the new sum
                total += val * second;
            }

            System.out.println(total);
        }
        scanner.close();

    }
}
