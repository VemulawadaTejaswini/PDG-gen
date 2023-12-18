import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)
    {
        int[] sides = getInput();
        int a = sides[0];
        int b = sides[1];
        int c = sides[2];
        System.out.println(a * b / 2);
    }

    private static int[] getInput()
    {
        int[] ret = new int[3];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] digtes = br.readLine().split(" ");
            ret[0] = Integer.parseInt(digtes[0]);
            ret[1] = Integer.parseInt(digtes[1]);
            ret[2] = Integer.parseInt(digtes[2]);
        } catch (IOException e) {
            return null;
        }
        return ret;
    }

}
