import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

//      1??????????????§???????????????????????????????????????????????????????´??????????
        String[] strArray = input.split(" ");

        int a, b, c;

        a = Integer.parseInt(strArray[0]);
        b = Integer.parseInt(strArray[1]);
        c = Integer.parseInt(strArray[2]);

        if (a < b ) {
            if (b < c){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}