import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N;
        String s;
        int redCounter = 0;
        int blueCounter = 0;
        Scanner scanner = new Scanner(System.in);

        N = Integer.valueOf(scanner.nextLine());
        s = scanner.nextLine();

        String c;
        for(int i = 0; i < N; i++) {
             c = String.valueOf(s.charAt(i));
            if (c.equals("B")) {
                blueCounter++;
            } else {
                redCounter++;
            }
        }
        if (redCounter > blueCounter) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
