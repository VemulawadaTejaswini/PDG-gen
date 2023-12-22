
public class Main {
    public static void main(String[] args) {
        if (args.length != 1) System.exit(0);
        int x = Integer.parseInt(args[0]);
        System.out.println((int) Math.pow(x, 3) + "");
    }
}