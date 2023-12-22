public class Main {
    public static void main(String[] args) {
        if (args.length != 1) return;
        int x = Integer.parseInt(args[0]);
        System.out.print((int) Math.pow(x, 3) + "\n");
    }
}