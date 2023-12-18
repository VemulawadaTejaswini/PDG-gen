import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String [] letters = new String[3];

        for (int i = 0; i < 3; i++) {
            letters[i] = input.readLine();
        }
        int current = 0;
        int [] positions = new int[3];
        positions[0] = 1;
        boolean state = false;
        while (true){
            if (positions[current] >= letters[current].length() && state){
                System.out.println((char)(current + 'A'));
                break;
            }
            state = true;
            current = letters[current].charAt(positions[current]) - 'a';

            positions[current]++;
        }
    }
}

