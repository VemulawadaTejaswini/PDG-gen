import java.util.Scanner;

class Itp0108a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        for (char c : s.toCharArray()){
            if ('A' <= c && c <= 'Z' || 'a' <= c && c <= 'z'){
                c ^= 32;
            }
            System.out.print(c);
        }
        System.out.println();
    }
}