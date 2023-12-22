import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = null;
        try {
            s = new Scanner(System.in);
            String line = s.nextLine();
            System.out.println(powBy3(Integer.parseInt(line)));
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }

    private static int powBy3(int i) {
        return i * i * i;
    }
}