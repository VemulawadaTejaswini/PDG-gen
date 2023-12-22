public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char in = sc.next().charAt(0);
            System.out.println('A' <= in && in <= 'Z' ? 'A' : 'a');
        }
    }

}
