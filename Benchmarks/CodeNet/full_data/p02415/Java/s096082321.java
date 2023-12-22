import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int length = line.length();
        String ans = "";
        char[] a;
        a = new char[length];
        for(int i=0; i<length; i++) {
            a[i] = line.charAt(i);
            if(Character.isLowerCase(a[i])) ans += Character.toUpperCase(a[i]);
            else ans += Character.toLowerCase(a[i]); 
        }
        System.out.println(ans);
    }
}
