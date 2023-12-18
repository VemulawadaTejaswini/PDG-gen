public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String N = input.next();

        System.out.println(N.indexOf('7'));
        if (N.indexOf('7') >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}