import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	Scanner parameter = new Scanner(System.in);

        String[] input1 = parameter.nextLine().split(" ");

        Integer limit = Integer.valueOf(input1[0]);

        Integer water1 = Integer.valueOf(input1[1]);

        Integer water2 = Integer.valueOf(input1[2]);

        System.out.println(water1 + water2 < limit ? 0 : water2 + water1 -limit);
    }
}
