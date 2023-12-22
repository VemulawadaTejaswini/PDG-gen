import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        String base26 = Long.toString(n, 26);
        System.out.println(convertBase26(base26));
    }

    private static String convertBase26(String base26) {
        String[] strArray = base26.split("");
        StringBuilder builder = new StringBuilder();
        for (int i = strArray.length; i > 0; i--) {
            if (strArray[i-1].matches("1")) {
                builder.insert(0, "a");
                continue;
            } else if (strArray[i-1].matches("2")) {
                builder.insert(0, "b");
                continue;
            } else if (strArray[i-1].matches("3")) {
                builder.insert(0, "c");
                continue;
            } else if (strArray[i-1].matches("4")) {
                builder.insert(0, "d");
                continue;
            } else if (strArray[i-1].matches("5")) {
                builder.insert(0, "e");
                continue;
            } else if (strArray[i-1].matches("6")) {
                builder.insert(0, "f");
                continue;
            } else if (strArray[i-1].matches("7")) {
                builder.insert(0, "g");
                continue;
            } else if (strArray[i-1].matches("8")) {
                builder.insert(0, "h");
                continue;
            } else if (strArray[i-1].matches("9")) {
                builder.insert(0, "i");
                continue;
            } else if (strArray[i-1].matches("a")) {
                builder.insert(0, "j");
                continue;
            } else if (strArray[i-1].matches("b")) {
                builder.insert(0, "k");
                continue;
            } else if (strArray[i-1].matches("c")) {
                builder.insert(0, "l");
                continue;
            } else if (strArray[i-1].matches("d")) {
                builder.insert(0, "m");
                continue;
            } else if (strArray[i-1].matches("e")) {
                builder.insert(0, "n");
                continue;
            } else if (strArray[i-1].matches("f")) {
                builder.insert(0, "o");
                continue;
            } else if (strArray[i-1].matches("g")) {
                builder.insert(0, "p");
                continue;
            } else if (strArray[i-1].matches("h")) {
                builder.insert(0, "q");
                continue;
            } else if (strArray[i-1].matches("i")) {
                builder.insert(0, "r");
                continue;
            } else if (strArray[i-1].matches("j")) {
                builder.insert(0, "s");
                continue;
            } else if (strArray[i-1].matches("k")) {
                builder.insert(0, "t");
                continue;
            } else if (strArray[i-1].matches("l")) {
                builder.insert(0, "u");
                continue;
            } else if (strArray[i-1].matches("m")) {
                builder.insert(0, "v");
                continue;
            } else if (strArray[i-1].matches("n")) {
                builder.insert(0, "x");
                continue;
            } else if (strArray[i-1].matches("o")) {
                builder.insert(0, "x");
                continue;
            } else if (strArray[i-1].matches("p")) {
                builder.insert(0, "y");
                continue;
            } else if (strArray[i-1].matches("q")) {
                builder.insert(0, "z");
                continue;
            }
        }
        return builder.toString();
    }
}
