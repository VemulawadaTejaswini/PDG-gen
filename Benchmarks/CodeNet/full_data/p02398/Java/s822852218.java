import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        int num = 0;
        ArrayList<Integer> yaku = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int c = Integer.parseInt(line[2]);

        for (int x = 1; x <= c; x++) {
            if (c % x == 0) {
                yaku.add(x);
            } else {

            }
        }


            do {
                if (yaku.contains(a)) {
                    num++;
                }

                a++;
                
                

            } while (a-1 != b);
        

        System.out.println(num);

    }

}