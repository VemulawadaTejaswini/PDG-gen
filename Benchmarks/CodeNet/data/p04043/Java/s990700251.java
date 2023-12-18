import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.exec();
    }
    
    private void exec() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] params = input.split(" ");
        int fiveCount = 0;
        int sevenCount = 0;
        for (String param : params) {
            if (param.equals("5")) {
                fiveCount++;
            } else if (param.equals("7")) {
                sevenCount++;
            }
        }
        if (fiveCount == 2 && sevenCount == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
    }
}