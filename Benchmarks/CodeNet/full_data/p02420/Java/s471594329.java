import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        String word;
        int m;
        int h;
        int original_length;
        while (true) {
            word = scan.next();
            if ("-".equals(word))
                break;
            m = scan.nextInt();
            for (int i = 0; i < m; i++) {
                h = scan.nextInt();
                original_length = word.length();
                word = word + word.substring(0,h);
                word = word.substring(word.length() - original_length);
            }
            output.append(word + '\n');
        }
        System.out.print(output);
    }
}