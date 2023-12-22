import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        ArrayList<Integer> x_list = new ArrayList<>();
        ArrayList<Integer> y_list = new ArrayList<>();

        int x;
        int y;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            String[] line = br.readLine().split(" ");
            x = Integer.parseInt(line[0]);
            y = Integer.parseInt(line[1]);

            if (x == 0 && y == 0) {
                break;
            }

            x_list.add(x);
            y_list.add(y);

        } while (x != 0 || y != 0);

        for (int n = 0; n < x_list.size(); n++) {
            for (int a = 0; a < x_list.get(n); a++) {

                for (int b = 0; b < y_list.get(n); b++) {
                    
                    if(a % 2 == 0){
                        if(b % 2 == 0) System.out.printf("#");
                        else System.out.printf(".");
                    }
                    else{
                        if(b % 2 == 0) System.out.printf(".");
                        else System.out.printf("#");
                    }
                }

                System.out.println();
            }

            System.out.println();
        }

    }

}