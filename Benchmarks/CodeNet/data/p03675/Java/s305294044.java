import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main( String... args ) throws Exception {

        BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
        String input = in.readLine();

        List<String> inputList = new ArrayList<>();
        List<String> outputList = new ArrayList<>();

        while ( input != null ) {
            inputList.add( input );
            input = in.readLine();
        }

        int number = Integer.parseInt( inputList.get( 0 ) );

        for ( String a : inputList.get( 1 ).split( " " ) ) {
            if ( outputList.size() < number ) {
                outputList.add( a );
                outputList = reverse( outputList );
            }
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
