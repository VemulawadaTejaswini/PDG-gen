public class Program {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        String value = sc.next();

        int charValue = value.charAt(0);
        String next = String.valueOf( (char) (charValue + 1));
        System.out.println(next);


    }
}