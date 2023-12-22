import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for( int i = 0; i < 10; i++ ) {
            list.add( Integer.parseInt(br.readLine()) );
        }
        Collections.sort(list, Collections.reverseOrder());
        for( int i = 0; i< 3; i++  ) {
            System.out.println( list.get(i) );
        }
    }
}

