import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(scanner.next());
        }

        List<String> result = new ArrayList<>();

        Boolean is_Exited = false;

        for (int i = 0; i < N - 1; i++) {
            if (list.get(i).equals("AB")) {
                if (A == 0 && B == 0) {
                    System.out.println("No");
                    break;
                }
                if (A > B || (A == B && list.get(i + 1).equals("BC"))) {
                    A -= 1;
                    B += 1;
                    result.add("B");
                } else {
                    A += 1;
                    B -= 1;
                    result.add("A");
                }
            }
            if (list.get(i).equals("BC")) {
                if (B == 0 && C == 0) {
                    System.out.println("No");
                    break;
                }
                if (B > C || (B == C && list.get(i + 1).equals("AC"))) {
                    B -= 1;
                    C += 1;
                    result.add("C");
                } else {
                    B += 1;
                    C -= 1;
                    result.add("B");
                }
            }
            if (list.get(i).equals("AC")) {
                if (A == 0 && C == 0) {
                    System.out.println("No");
                    break;
                }
                if (A > C || (A == C && list.get(i + 1).equals("BC"))) {
                    A -= 1;
                    C += 1;
                    result.add("C");
                } else {
                    A += 1;
                    C -= 1;
                    result.add("A");
                }
            }
        }
        for (int i = N - 1; i < N; i++) {
            if (list.get(i).equals("AB")) {
                if (A == 0 && B == 0) {
                    System.out.println("No");
                    return;
                }
                if (A > B) {
                    A -= 1;
                    B += 1;
                    result.add("B");
                } else {
                    A += 1;
                    B -= 1;
                    result.add("A");
                }
            }
            if (list.get(i).equals("BC")) {
                if (B == 0 && C == 0) {
                    System.out.println("No");
                    return;
                }
                if (B > C) {
                    B -= 1;
                    C += 1;
                    result.add("C");
                } else {
                    B += 1;
                    C -= 1;
                    result.add("B");
                }
            }
            if (list.get(i).equals("AC")) {
                if (A == 0 && C == 0) {
                    System.out.println("No");
                    return;
                }
                if (A > C) {
                    A -= 1;
                    C += 1;
                    result.add("C");
                } else {
                    A += 1;
                    C -= 1;
                    result.add("A");
                }
            }
        }
        System.out.println("Yes");
        for (String s : result) {
            System.out.println(s);
        }
    }
}