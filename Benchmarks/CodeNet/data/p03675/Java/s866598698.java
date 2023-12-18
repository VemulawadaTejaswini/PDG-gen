import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main( String... args ) throws Exception {

        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int number = sc.nextInt();
        // スペース区切りの整数の入力
        String array = sc.nextLine();
        List<String> outputList = new ArrayList<>();

        for ( String a :  array.split( " " ) ) {
                outputList.add( a );
                outputList = reverse( outputList );
        }

        System.out.println( String.join( " ", outputList ) );
    }

    /**
     * @param inputList
     * @return
     */
    private static List<String> reverse( List<String> inputList ) {
        List<String> outputList = new ArrayList<>();

        for ( int i = inputList.size(); i > 0; i-- ) {
            outputList.add( inputList.get( i - 1 ) );
        }
        return outputList;

    }
}
