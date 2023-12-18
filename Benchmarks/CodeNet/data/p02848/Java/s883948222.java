import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String word = scanner.next();
        String answer = "";
        for(int i = 0; i < word.length; i ++){
          answer += (word.charAt(i) + number);
        }
        System.out.println(answer);
    }
}
