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
        char[] input = sc.next().toCharArray();
        String ans = "";
        int count = 0;

        for(int i=0; i<input.length; i++){
            String in = String.valueOf(input[i]);
            if(i == 0 || i == input.length-1){
                ans += in;
            } else if(i == input.length-2){
                count++;
                ans += String.valueOf(count);
            } else {
                count++;
            }
        }

        System.out.println(ans);
    }

}