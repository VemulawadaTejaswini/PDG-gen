import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);
        int length = input.length();
        String replaceStr = Integer.toString(length-2);
        sb.replace(1,length-1, replaceStr);
        System.out.println(sb);
    }
}
