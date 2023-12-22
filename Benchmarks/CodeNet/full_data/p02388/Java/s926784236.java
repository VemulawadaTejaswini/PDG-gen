public class Main {

    public static void main(String[] args) {
        int x;
        if (args[0] == null || args[0].isEmpty()) {
            x = 0;
        } else {
            x = Integer.parseInt(args[0]);
        }
        System.out.println(x * x * x);
    }
}