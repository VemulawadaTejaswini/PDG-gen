import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String w = scan.nextLine().toLowerCase();

        int nMatch = 0;
        while (scan.hasNext()) {
            String rawWord = scan.next();
            if (rawWord.equals("END_OF_TEXT"))
                break;

            String word = rawWord.toLowerCase();
            if (w.equals(word))
                nMatch++;
        }

        System.out.println(nMatch);
    }
}