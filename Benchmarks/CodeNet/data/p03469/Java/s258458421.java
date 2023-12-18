import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        char[] date_c = date.toCharArray();
        date_c[3] = '8';
        for(int i = 0; i < 10; i++)
        {
            System.out.print(date_c[i]);
        }
    }
}
