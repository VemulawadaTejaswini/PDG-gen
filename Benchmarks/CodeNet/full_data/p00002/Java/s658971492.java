public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int total = a + b;
        int count = 1;
        while (total == 0) {
            int total = total / 10;
            if (total > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
