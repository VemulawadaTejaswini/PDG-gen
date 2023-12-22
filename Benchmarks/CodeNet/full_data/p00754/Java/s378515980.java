import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String line = sc.nextLine();
            char[] chars = line.toCharArray();
            if (chars[0] == '.') {
                break;
            }

            char[] brackets = new char[101];
            brackets[0] = ' ';
            int index = 1;
            for (char c : chars) {
                if (c == '(' || c == '[') {
                    brackets[index] = c;
                    index++;
                } else if (c == ')') {
                    if (brackets[index - 1] == '(') {
                        brackets[index - 1] = ' ';
                        index--;
                    } else {
                        brackets[index] = 'x';
                        break;
                    }
                } else if (c == ']') {
                    if (brackets[index - 1] == '[') {
                        brackets[index - 1] = ' ';
                        index--;
                    } else {
                        brackets[index] = 'x';
                        break;
                    }
                }
            }

            String bracketString = new String(brackets);
            String result = bracketString.trim();

            if (result.equals("")) {
                System.out.println("yes");
            } else {
                System.out.println("no");

            }

        }

        sc.close();
    }

}

