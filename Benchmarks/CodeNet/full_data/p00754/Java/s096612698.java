import java.util.*;

public class Main {
    public static boolean processLine(String line) {
        ArrayList<Character> stack = new ArrayList<Character>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            switch (c) {
            case '[':
                stack.add(c);
                break;
            case ']':
                if (stack.size() > 0 && stack.get(stack.size() - 1) == '[') {
                    stack.remove(stack.size() - 1);
                } else {
                    return false;
                }
                break;
            case '(':
                stack.add(c);
                break;
            case ')':
                if (stack.size() > 0 && stack.get(stack.size() - 1) == '(') {
                    stack.remove(stack.size() - 1);
                } else {
                    return false;
                }
                break;
            }
        }
        return stack.size() == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.equals(".")) {
                return;
            }
            boolean yes = processLine(line);
            if (yes) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        sc.close();
    }
}

