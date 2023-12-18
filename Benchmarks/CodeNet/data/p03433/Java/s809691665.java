public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), a = scanner.nextInt();
        int m = n % 500;
        if (m <= a) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}