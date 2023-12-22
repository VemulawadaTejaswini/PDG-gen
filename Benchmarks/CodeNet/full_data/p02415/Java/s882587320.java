import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s;
        s = sc.nextLine();
        int i=0;

        char[] c;
        c = new char[s.length()];

        for (i = 0; i < s.length(); ++i) {

            c[i] = s.charAt(i);

            if (s.charAt(i) <= 90 && s.charAt(i) >= 65) {
                c[i] += 32;
            } else if ((s.charAt(i) <= 122 && s.charAt(i) >= 97)) {
                c[i] -= 32;
            }
        }
        for (i = 0; i < s.length(); ++i){
                System.out.print(c[i]);
        }
        System.out.println();
    }
}

