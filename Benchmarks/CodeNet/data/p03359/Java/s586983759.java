 import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = readInt();
        int b = readInt();

        System.out.println(Math.min(a, b));

    }

    private static int readInt(){
        return Integer.parseInt(sc.next());
    }

    private static long readLong(){
        return Long.parseLong(sc.next());
    }

}
