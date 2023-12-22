import java.util.Scanner;

public class Main 
{
    public static void main( String[] args )
    {
        try (Scanner scan = new Scanner(System.in)) {
            String input = scan.nextLine();
            int rain = 0, repeat = 0;
            for (char c : input.toCharArray()) {
                if (c == 'R') repeat++;
                else repeat = 0;
                if (rain < repeat) rain = repeat;
            }
            System.out.println(rain);
        }
    }
}