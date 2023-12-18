public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();

        for (int i = 0; i < 2019 && l + i <= r ;i++) {
            if ((l + i) % 2019 == 0) {
                System.out.print(0);
                return;
            }
        }

        System.out.print((l * (l + 1)) % 2019);
    }
}