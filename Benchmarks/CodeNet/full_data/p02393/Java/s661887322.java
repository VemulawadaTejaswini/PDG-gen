import java.util.Arrays;
import java.util.Scanner;
 
class Main {
    Scanner sc = new Scanner(System.in);
 
    public void run() {
        int[] num = new int[] { sc.nextInt(), sc.nextInt(), sc.nextInt() };
        Arrays.sort(num);
 
        ln(StringUtils.join(num, " "));
    }
 
    public static void main(String[] args) {
        new Main().run();
    }
 
    public static void pr(Object o) {
        System.out.print(o);
    }
 
    public static void ln(Object o) {
        System.out.println(o);
    }
 
    public static void ln() {
        System.out.println();
    }
}
 
class StringUtils {
    public static String join(int[] array, String separator) {
        StringBuilder str = new StringBuilder(array[0] + "");
        for (int i = 1; i < array.length; i++) {
            str.append(separator).append(array[i] + "");
        }
        return str.toString();
    }
 
    public static String join(Object[] array, String separator) {
        StringBuilder str = new StringBuilder(array[0] + "");
        for (int i = 1; i < array.length; i++) {
            str.append(separator).append(array[i] + "");
        }
        return str.toString();
    }
}
