import java.io.*;

public class Main {
    /**
     *
     */

    private static final int _10000 = 10000;

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 1;
        try {
            while (i < 10000) {
            String line = reader.readLine();
            int x = Integer.parseInt(line);
            if (x == 0) break;
            System.out.println("Case" + i + ": " + x);
            i++;
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e){
            System.out.println("falese");
        }
    }
}
