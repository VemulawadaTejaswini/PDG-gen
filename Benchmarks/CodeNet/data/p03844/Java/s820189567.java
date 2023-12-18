import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] strings = line.split(" ");
        
        String op = strings[1];
        int X = Integer.parseInt(strings[0]);
        int Y = Integer.parseInt(strings[2]);
        
        int answer;
        if (op.equals("+")) {
            answer = X + Y;
        } else {
            answer = X - Y;
        }
        
        System.out.println(answer);
        
    }
}
