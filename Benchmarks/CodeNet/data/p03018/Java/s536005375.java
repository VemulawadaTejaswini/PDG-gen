import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String stn = str.replaceAll("BC", "D");
        long a_count = 0;
        long count = 0;
        for(int i = 0; i < stn.length(); i++) {
            char a = stn.charAt(i);
            if (a == 'A') a_count++;
            else if (a == 'D') count += a_count;
            else a_count = 0;
        }
        System.out.println(count);
    }
}