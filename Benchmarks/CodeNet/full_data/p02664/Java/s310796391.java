import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        String T = scanner.next();
        T = T.replace("?", "D");
//        int sum = T.split("D", -1).length-1;
//        sum += T.split("PD", -1).length-1;


        System.out.println(T);
    }
}
