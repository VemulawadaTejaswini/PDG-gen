import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String init = scanner.next();
        int queryCount = scanner.nextInt();

        StringBuilder builder = new StringBuilder(init);

        boolean prefetch = false; // reverse連続は実行する意味がないのでそのための変数
        int next = -1;
        for (int i = 0; i < queryCount; i++) {
            int kind;
            if (prefetch) {
                prefetch = false;
                kind = next;
            } else {
                kind = scanner.nextInt();
            }

            if (kind == 1) {

                if (i != (queryCount - 1) && scanner.hasNext()) {
                    next = scanner.nextInt();
                    if (next == 1) {
                        i++;
                        continue;
                    }
                    prefetch = true;
                }
                builder.reverse();


            } else {
                int position = scanner.nextInt();
                String value = scanner.next();
                if (position == 1) {
                    builder.insert(0, value);
                } else {
                    builder.append(value);
                }
            }
        }
        System.out.println(builder.toString());
    }
}