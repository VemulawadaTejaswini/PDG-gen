import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader ( 
            new InputStreamReader( System.in));

        int a = Integer.parseInt( br.readLine());
        int b = Integer.parseInt( br.readLine());

        if ( (a * b) % 2 == 0 )
            System.out.println( "Even" );
        else
            System.out.println( "Odd" );
 
    }
}