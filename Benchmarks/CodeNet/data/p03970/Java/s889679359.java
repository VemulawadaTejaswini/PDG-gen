import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String origin = "CODEFESTIVAL2016";
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine();
            int total = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != origin.charAt(i)) total++;
            }
            System.out.println(total);
        }
    }
}
