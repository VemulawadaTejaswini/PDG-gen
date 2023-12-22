import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] l=sc.next().toCharArray();
        for(char c:l) {
            System.out.print((char)(c<'D'?c+23:c-3));
        }
        System.out.println();
    }
}
