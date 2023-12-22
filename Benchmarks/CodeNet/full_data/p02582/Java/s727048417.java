import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();
        sc.close();

        int cnt = 0;
        boolean day1 = s[0] == 'R';
        boolean day2 = s[1] == 'R';
        boolean day3 = s[2] == 'R';

        if(day1 && day2 && day3) cnt = 3;
        else if((day1 && day2) || (day2 && day3)) cnt = 2;
        else if(day1 || day2 || day3) cnt = 1;
        else cnt = 0;
        System.out.println(cnt);
    }
}
