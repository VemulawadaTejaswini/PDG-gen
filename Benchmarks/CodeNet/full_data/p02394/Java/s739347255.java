import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] strArray = input.split(" ");

        int W = Integer.parseInt(strArray[0]);
        int H = Integer.parseInt(strArray[1]);
        int x = Integer.parseInt(strArray[2]);
        int y = Integer.parseInt(strArray[3]);
        int r = Integer.parseInt(strArray[4]);

        if(r <= x && r <= y){
            if( (x + r) <= W && (y + r) <= H){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}