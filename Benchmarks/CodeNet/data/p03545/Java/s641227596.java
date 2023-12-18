import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
    /**
     * Iterate through each line of input.
     */
    int[] array;
    String answer = "";

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run(){
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();
        array = new int[input.length];

        for(int i=0; i<input.length; i++){
            array[i] = Character.getNumericValue(input[i]);
        }

        dfs(0, array[0], String.valueOf(array[0]));
        System.out.println(answer);
    }

    void dfs(int x, int sum, String ans){
        if(x == 3){
            if(sum == 7){
                for(int i=x; i<array.length-1; i++){
                    ans += "+0";
                }
                answer = ans + "=7";
                return;
            }
        } else {
            dfs(x+1, sum + array[x+1], ans + "+" + array[x+1]);
            dfs(x+1, sum - array[x+1], ans + "-" + array[x+1]);
        }
    }
}
