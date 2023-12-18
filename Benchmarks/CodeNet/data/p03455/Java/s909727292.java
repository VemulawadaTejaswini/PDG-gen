import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short a = Short.parseShort(sc.next());
        short b = Short.parseShort(sc.next());

        short c = (short) (a * b);
        c = (short) (c << 15);
        c = (short) (c >> 15);
        if(c == 0){
            System.out.println("Enen");
        }else {
            System.out.println("Odd");
        }
    }
}
