

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lines = line.split(" ");
        int D = Integer.parseInt(lines[0]);
        int N = Integer.parseInt(lines[1]);

        int D2 = (int)Math.pow(100, D);
        System.out.println(D2 * N);
    }
}
