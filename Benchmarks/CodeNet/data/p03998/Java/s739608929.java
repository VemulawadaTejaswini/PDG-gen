import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next().toUpperCase();
        String b = sc.next().toUpperCase();
        String c = sc.next().toUpperCase();
        int idxa = 0;
        int idxb = 0;
        int idxc = 0;
        char temp = 'A';
        while (true) {
            if (temp == 'A') {
                if (idxa >= a.length()) {
                    break;
                }
                temp = a.charAt(idxa);
                idxa++;
            } else if (temp == 'B') {
                if (idxb >= b.length()) {
                    break;
                }
                temp = b.charAt(idxb);
                idxb++;
            } else if (temp == 'C') {
                if (idxc >= c.length()) {
                    break;
                }
                temp = c.charAt(idxc);
                idxc++;
            }
        }
        System.out.println(temp);
    }
}