import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String line = stdin.readLine();
        String[] temp = line.split(" ");
        int D = Integer.parseInt(temp[0]);
        int T = Integer.parseInt(temp[1]);
        int S = Integer.parseInt(temp[2]);

        if(T*S>=D){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
