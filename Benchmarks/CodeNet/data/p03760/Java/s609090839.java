import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String o = sc.next();
        String e = sc.next();

        char[] array = new char[o.length()+e.length()];

        boolean f = false;
        for(int i = 0; i<array.length; i++) {
            if(f) array[i] = e.charAt(i/2);
            else array[i] = o.charAt(i/2);
            f = !f;
        }
        for(char c: array) {
            System.out.print(c);
        }
        System.out.println();

    }
}