import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        for (char c : s.toCharArray()){
            if ('A' <= c && c <= 'Z'){
                System.out.print(Character.toLowerCase(c));
            }
            else if ('a' <= c && c <= 'z'){
                System.out.print(Character.toUpperCase(c));
            }
            else {
                System.out.print(c);
            }
        }
        System.out.println();
    }
}