import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        String s = std.next();
        String[] cubes = s.split("");
        int redCube = 0;
        int blueCube = 0;
        for (int i = 0; i < cubes.length; i++) {
            if (cubes[i].equals("0")) {
                redCube++;
            } else {
                blueCube++;
            }
        }

        System.out.println(Math.min(redCube, blueCube) * 2);
    }
}
