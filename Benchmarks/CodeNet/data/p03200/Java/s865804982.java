
public class Main {
    public static void main(String [] args) {
        final Scanner scanner = new Scanner(System.in);
        final String s = scanner.next();
        int count = 0;
        int wIndex = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'W') {
                count += i - wIndex;
                ++wIndex;
            }
        }
        System.out.println(count);
    }
}