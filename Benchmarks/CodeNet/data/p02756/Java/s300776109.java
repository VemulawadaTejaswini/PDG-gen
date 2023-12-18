import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");
        StringBuilder s = new StringBuilder(values[0]);
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        line = scanner.nextLine();
        values = line.split(" ");

        final long q = Long.parseLong(values[0]);
        int rev = 0;
        String qi;
        int fi;
        for (int i = 0; i < q; i++) {
            line = scanner.nextLine();
            qi = String.valueOf(line.charAt(0));
            if (qi.equals("1")) {
                rev++;
            } else {
                values = line.split(" ");
                fi = Integer.parseInt(values[1]);
                if (fi == 1) {
                    if (rev % 2 == 0) {
                        left.insert(0,values[2]);
                    } else {
                        right.append(values[2]);
                    }
                } else {
                    if (rev % 2 == 0) {
                        right.append(values[2]);
                    } else {
                        left.insert(0,values[2]);
                    }
                }
            }
        }
        if (rev % 2 == 1) {
            s.reverse();
            System.out.println(right.reverse().toString() + s.toString() + left.reverse().toString());
        } else {
            System.out.println(left.toString() + s.toString() + right.toString());
        }
    }
}