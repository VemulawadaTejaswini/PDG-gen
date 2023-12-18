import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type something");

        int num = 0;
        String str = br.readLine();

        for (int i=0;i<6;i++){
            if (str.charAt(i) == '1'){
                num = num + 1;
            }
        }
        System.out.println(num);
    }
}