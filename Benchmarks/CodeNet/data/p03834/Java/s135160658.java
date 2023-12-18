public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String haiku = scan.next();
        System.out.println(haiku.replace(","," "));
        scan.close();
    }
}