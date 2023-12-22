import java.util.Scanner;

 
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        StringBuilder out = new StringBuilder();

        for (int i=0; i<in.length(); i++) {
            char c = in.charAt(i);
            if (Character.isUpperCase(c)) {
                out.append(Character.toLowerCase(c));
            } else if (Character.isLetter(c)) {
                out.append(Character.toUpperCase(c));
            } else {
                out.append(c);
            }
        }

        System.out.println(out);

    }
}

