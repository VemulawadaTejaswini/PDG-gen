import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        StringBuilder ans = new StringBuilder();

        String front = S.substring(0, 2);
        String back = S.substring(2);
        if ((front.equals("00") & back.equals("00")) || (Integer.parseInt(front) > 12 && Integer.parseInt(back) > 12)) {
            System.out.println("NA");
            System.exit(0);
        }

        if (Integer.parseInt(front) <= 12 &&Integer.parseInt(back) <= 12 && Integer.parseInt(front) >= 1 &&Integer.parseInt(back) >= 1) {
            System.out.println("AMBIGUOUS");
            System.exit(0);
        }

        if (Integer.parseInt(back) >= 1 && Integer.parseInt(back) <= 12) {
            System.out.println("YYMM");
            System.exit(0);
        } else if (Integer.parseInt(front) >= 1 && Integer.parseInt(front) <= 12) {
            System.out.println("MMYY");
            System.exit(0);
        }
    }
}
