import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        if (word.equals("A")) {
            System.out.print("T");
        } else if (word.equals("A")) {
            System.out.print("A");
        } else if (word.equals("C")) {
            System.out.print("G");
        } else if (word.equals("G")) {
            System.out.print("C");
        }
    }
}