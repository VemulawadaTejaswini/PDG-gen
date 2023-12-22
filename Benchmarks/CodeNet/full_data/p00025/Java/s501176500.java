/**
 * Created by rchen01 on 11/3/17.
 */
import java.io.*;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int blow = 0;
            int hit = 0;

            String test = br.readLine();
            if(test == null) {
                break;
            }

            String[] imagine = test.split(" ");
            String[] guess = br.readLine().split(" ");

            TreeMap<String, Integer> numbers = new TreeMap<>();

            for(int i = 0; i < imagine.length; i++) {
                numbers.put(imagine[i], 1);

                if(imagine[i].equals(guess[i])) {
                    hit++;
                }
                else {
                    if(numbers.get(guess[i]) != null) {
                        blow++;
                    }
                }
            }
            System.out.println(hit + " " + blow);
        }
    }
}