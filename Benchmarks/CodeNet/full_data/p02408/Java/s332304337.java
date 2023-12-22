import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        int a = 0;

        ArrayList<String> list1 = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            list1.add(br.readLine());
        }

        for (int i = 1; i < 14; i++) {
            if (list1.contains("S " + i) == false) {
                System.out.println("S " + i);
            }
        }

        for (int i = 1; i < 14; i++) {
            if (list1.contains("H " + i) == false) {
                System.out.println("H " + i);
            }
        }

        for (int i = 1; i < 14; i++) {
            if (list1.contains("C " + i) == false) {
                System.out.println("C " + i);
            }
        }

        for (int i = 1; i < 14; i++) {
            if (list1.contains("D " + i) == false) {
                System.out.println("D " + i);
            }
        }

    }

}