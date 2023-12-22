import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int inputInt;
        int i = 1;
        for (;;) {
            inputInt = Integer.parseInt(sc.nextLine());
            if (inputInt == 0) {
                break;
            }
            i++;
            sb.append("Case " + i + ": " + inputInt + "\n");
        }

        System.out.print(sb);
    }
}