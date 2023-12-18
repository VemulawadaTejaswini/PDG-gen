import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < input.length(); i++){
            sb.append("x");
        }
        System.out.println(sb.toString());
    }
}