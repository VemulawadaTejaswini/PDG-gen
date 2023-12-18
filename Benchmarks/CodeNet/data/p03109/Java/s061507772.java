import java.text.SimpleDateFormat;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println(new SimpleDateFormat("yyyy/mm/dd").parse(scanner.next()).getTime() <= 1548774240000L ? "Heisei" : "TBD");
    }
}