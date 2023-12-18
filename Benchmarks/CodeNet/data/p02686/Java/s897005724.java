import java.util.*;

public class Main {
    private static boolean isValidParenthesis(String[] str, int n) {
        int totalLen = 0;
        for (int i = 0; i < n; i++) {
            totalLen += str[i].length();
        }

        if (totalLen % 2 > 0) {
            return false;
        }

        String[] str1 = new String[n];
        for (int i = 0; i < n; i++) {
            str1[i] = validateString(str[i]);
        }

        return buildAndValidateStrings(str1, 0, n, "", new HashSet<>());
    }

    private static boolean buildAndValidateStrings(String[] str, int index, int n, String s, Set<Integer> visited) {
        if (index == n) {
            return isValid(s);
        }

        for (int i = 0; i < n; i++) {
            if (!visited.contains(i) && !str[i].equals("")) {
                visited.add(i);
                if (buildAndValidateStrings(str, i + 1, n, s + str[i], visited)) {
                    return true;
                }
                visited.remove(i);
            }
        }

        return false;
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    private static String validateString(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = N, i = 0;
        String[] str = new String[N];
        sc.nextLine();

        while (count-- > 0) {
            str[i++] = sc.nextLine();
        }

        System.out.println(isValidParenthesis(str, N));

        sc.close();
    }
}