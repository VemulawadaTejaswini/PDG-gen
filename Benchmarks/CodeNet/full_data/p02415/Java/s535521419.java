import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int length;
        String ans = "";
        char[] a;
        while(line != null) {
            length = line.length();
            a = new char[length];
            for(int i=0; i<length; i++) {
                a[i] = line.charAt(i);
                if(Character.isLowerCase(a[i])) ans += Character.toUpperCase(a[i]);
                else ans += Character.toLowerCase(a[i]);
            }
            System.out.printf("%s", ans);
            line = sc.nextLine();
        }
        System.out.println();
    }
}
