import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    int[] inputArray;

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            String input = String.valueOf(s.charAt(i));

            if((i+1) % 2 != 0){
                ans.append(input);
            }
        }

        System.out.println(ans);
    }

}