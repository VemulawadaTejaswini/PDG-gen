import java.util.Scanner;

/**
 * Created by khrom on 2017/06/11.
 */
public class Main {
    public static void main(String[] args) {
        String[] square = new Scanner(System.in).next().split("\\s");
        System.out.println(Integer.parseInt(square[0]) * Integer.parseInt(square[1]));
    }
}