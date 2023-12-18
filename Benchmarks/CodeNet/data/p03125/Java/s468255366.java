public class Main {
    public static void main(String[] args) {
        int tA = Integer.parseInt(args[0]);
        int tB = Integer.parseInt(args[1]);

        System.out.println(tB % tA == 0 ? tA + tB : tB - tA);
    }
}