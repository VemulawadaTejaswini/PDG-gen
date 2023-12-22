import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();

        for (char q : c) {
            if (Character.isUpperCase(q)) {
                System.out.print((q + "").toLowerCase());
            } else {
                System.out.print((q + "").toUpperCase());
            }
        }

        System.out.println();

    }

}
