
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) throws Exception {

        final Scanner scan = new Scanner(System.in);
        final String line = scan.nextLine();
        String[] cells = line.split(" ");

        long yoko = Long.parseLong(cells[0]);
        long tate = Long.parseLong(cells[1]);

        long ans1 = (tate / 2) * (yoko/2);
        long ans2 = (tate - (tate /2)) * (yoko - (yoko/2));
        
        long ans = ans1 + ans2;

        System.out.println(ans);
        scan.close();
    }