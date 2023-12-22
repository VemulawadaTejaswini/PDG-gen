
public class Main {
    public static void main(String[] args) {
        int x = Integer.parseInt(new Scanner(System.in).next());
        if (x < 1 || x > 100) return;
        System.out.println((x * x * x));
    }
}