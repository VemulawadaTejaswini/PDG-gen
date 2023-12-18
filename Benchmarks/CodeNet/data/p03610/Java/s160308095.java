import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();

        String str = new String();
        for(int i=0; i<s.length; i+=2) {
            str += Character.toString(s[i]);
        }
        System.out.println(str);
        sc.close();
    }
}
