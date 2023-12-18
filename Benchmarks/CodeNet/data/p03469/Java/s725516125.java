import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();

        for(int i=0; i<s.length; i++) {
            if(i == 3) {
                s[i] = '8';
            } else if (i == s.length-1) {
                System.out.println(s[i]);
            }
            System.out.print(s[i]);
        }
        sc.close();
    }
}
