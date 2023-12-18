import java.util.*;

class Main {
    public static void main(String... args) {
        int A = IN.nextInt();
		int B = IN.nextInt();
        puts((A * B) % 2 == 1 ? "Yes" : "No");
    }
    static final Scanner IN = new Scanner(System.in);
    static <T> void puts(T arg) { System.out.println(arg); }
}
