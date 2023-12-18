import java.util.*;
import java.util.function.BiConsumer;

public class Main {

    private static int max = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt( sc.nextLine() );
        String[] ss = new String[n];
        Map<String,Integer> map = new HashMap<>();
        max = 0;
        for( int i = 0 ; i < n ; i++ ){
            String str = sc.nextLine();
            Integer count = map.get( str );
            if( count == null ){
                count = 0;
            }
            max = Math.max( max , count + 1 );
            map.put( str , count + 1 );
        }

        List<String> outputs = new ArrayList<>();
        map.forEach((str, count) -> {
            if(count == max ){
                outputs.add( str );
            }
        });

        outputs.sort(String::compareTo);

        for (String output : outputs) {
            System.out.println(output);
        }

    }

}
