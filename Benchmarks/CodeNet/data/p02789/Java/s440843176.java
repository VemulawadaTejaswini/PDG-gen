public class Main {
    public static void main(String[] args) {
        System.out.println(a(args) ? "Yes":"No");
    }

    public static boolean a(String[] args) {
        return args[0].equals(args[1]);
    }
}
