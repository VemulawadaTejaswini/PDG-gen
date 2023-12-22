public class Main {
    public static void main(String... args) {
        final Scanner scanner = new Scanner(System.in);
        String str;
        while (!(str = scanner.nextLine()).equals("0 0")) {
            final int x = Integer.parseInt(str.split(" ")[0]);
            final int y = Integer.parseInt(str.split(" ")[1]);
            System.out.println(x < y ? x + " " + y : y + " " + x);
        }
    }
}