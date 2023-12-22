import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String input = scanner.nextLine();
            boolean isSmall = checkBracket(input,'(',')');
            boolean isLarge = checkBracket(input,'[',']');
            if (isSmall && isLarge){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }

    private static boolean checkBracket(String input, char left, char right) {
        int countLeft = 0;
        int countRight = 0;

        for (char c : input.toCharArray()) {
            if (c == left) {
                countLeft++;
            }
            if (c == right){
                countRight++;
            }
        }
        if (countLeft == countRight){
            return true;
        }
        return false;

    }

}
