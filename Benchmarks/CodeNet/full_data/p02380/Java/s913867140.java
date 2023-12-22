import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws IOException {
        Scanner scanner = new Scanner(System.in);
        String[] tmp = scanner.nextLine().split(" ");
        scanner.close();
        Integer side1 = Integer.valueOf(tmp[0]);
        Integer side2 = Integer.valueOf(tmp[1]);
        Double angle1 = Math.toRadians(Double.valueOf(tmp[2]));

        Double s = (side1 * side2 * Math.sin(angle1)) / 2;
        Double l = (side1 + side2)
                + Math.sqrt((side1 * side1) + (side2 * side2)
                        - (2 * side1 * side2 * Math.cos(angle1)));
        Double h = side1 * Math.sin(angle1);

        System.out.println(s+"\n"+l+"\n"+h);
    }

}