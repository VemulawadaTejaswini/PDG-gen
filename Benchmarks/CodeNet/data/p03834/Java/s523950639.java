import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner s = new Scanner(System.in);
        String haiku = s.nextLine();
        haiku = haiku.replace(","," ");
        System.out.printf(haiku);
    }
}
