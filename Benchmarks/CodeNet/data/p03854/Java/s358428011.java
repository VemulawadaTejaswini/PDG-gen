import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String[] selection = {"maerd", "remaerd", "esare", "resare"};

        if (!S.startsWith("d") && !S.startsWith("e")) {
            System.out.println("NO");
            return;
        }
        boolean splited = true;
        S = new StringBuilder(S).reverse().toString();
        WHILE:
        while (splited) {
            for (String aSelection : selection) {
                if (S.equals(aSelection)) {
                    System.out.println("YES");
                    return;
                }
                if (S.startsWith(aSelection)) {
                    splited = true;
                    String[] split = S.split(aSelection, 1);
                    S = split[1];
                    continue WHILE;
                }
            }
            splited = false;
        }

        System.out.println("NO");
    }
}
