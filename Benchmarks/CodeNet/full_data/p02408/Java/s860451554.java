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
            if (list1.contains("s " + i) == false) {
                System.out.println("s " + i);
            }
        }

        for (int i = 1; i < 14; i++) {
            if (list1.contains("h " + i) == false) {
                System.out.println("h " + i);
            }
        }

        for (int i = 1; i < 14; i++) {
            if (list1.contains("c " + i) == false) {
                System.out.println("c " + i);
            }
        }

        for (int i = 1; i < 14; i++) {
            if (list1.contains("d " + i) == false) {
                System.out.println("d " + i);
            }
        }

    }

}