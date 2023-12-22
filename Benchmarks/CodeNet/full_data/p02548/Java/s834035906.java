import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int answer = Integer.parseInt(line);

        int count = 0;
        for (int i = 1; i < answer; i++) {
            count += (answer -1) / i;
        }
        System.out.println(count);
    }
}
