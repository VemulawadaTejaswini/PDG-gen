public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("Draw");
        } else if ((a > b && b != 1) || a == 1) {
            System.out.println("Alice");
        } else {
            System.out.println("Bob");
        }
    }

}