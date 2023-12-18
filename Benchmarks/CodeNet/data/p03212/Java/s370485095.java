import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        int result = 0;
        if (n <= 700000000) {
            while (n >= 357) {
                String target = Integer.toString(n);
                if (target.startsWith("3") || target.startsWith("5") || target.startsWith("7")) {
                    if (target.endsWith("5") || target.endsWith("7")) {
                        result += judge(target) ? 1 : 0;
                        n -= 2;
                    } else if (target.endsWith("3")) {
                        result += judge(target) ? 1 : 0;
                        n -= 6;
                    } else {
                        n -= 1;
                    }
                } else {
                    if (target.startsWith("4") || target.startsWith("6") || target.startsWith("8")) {
                        n -= 10 * (target.length() - 1);
                    } else if (target.startsWith("9")) {
                        n -= 20 * (target.length() - 1);
                    } else if (target.startsWith("0")) {
                        n -= 30 * (target.length() - 1);
                    } else if (target.startsWith("1")) {
                        n -= 40 * (target.length() - 1);
                    } else if (target.startsWith("2")) {
                        n -= 50 * (target.length() - 1);
                    }
                }
            }
        } else {
            result += 20434;
            while (n >= 700000000) {
                String target = Integer.toString(n);
                if (target.startsWith("3") || target.startsWith("5") || target.startsWith("7")) {
                    if (target.endsWith("5") || target.endsWith("7")) {
                        result += judge(target) ? 1 : 0;
                        n -= 2;
                    } else if (target.endsWith("3")) {
                        result += judge(target) ? 1 : 0;
                        n -= 6;
                    } else {
                        n -= 1;
                    }
                } else {
                    if (target.startsWith("4") || target.startsWith("6") || target.startsWith("8")) {
                        n -= 10 * (target.length() - 1);
                    } else if (target.startsWith("9")) {
                        n -= 20 * (target.length() - 1);
                    } else if (target.startsWith("0")) {
                        n -= 30 * (target.length() - 1);
                    } else if (target.startsWith("1")) {
                        n -= 40 * (target.length() - 1);
                    } else if (target.startsWith("2")) {
                        n -= 50 * (target.length() - 1);
                    }
                }
            }
        }

        System.out.println(result);
    }

    public static boolean judge(String target) {
        if (!target.contains("1") &&
                !target.contains("2") &&
                !target.contains("4") &&
                !target.contains("6") &&
                !target.contains("8") &&
                !target.contains("9") &&
                !target.contains("0") &&
                target.contains("3") &&
                target.contains("5") &&
                target.contains("7")) {
            return true;
        } else {
            return false;
        }
    }

}