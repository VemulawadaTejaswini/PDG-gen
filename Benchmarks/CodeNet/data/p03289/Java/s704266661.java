import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    //グローバル変数を定義

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        char[] array = sc.next().toCharArray();
        String ans = "WA";

        if(array[0] == 'A'){
            int count = 0;
            for(int i=2; i<array.length-1; i++){
                if(array[i] == 'C'){
                    count++;
                }
            }

            if(count == 1){
                int upperCount = 0;
                for(int i=1; i<array.length; i++){
                    if(Character.isUpperCase(array[i])){
                        upperCount++;
                    }
                }

                if(upperCount == 1){
                    ans = "AC";
                }
            }
        }

        System.out.println(ans);
    }
}
