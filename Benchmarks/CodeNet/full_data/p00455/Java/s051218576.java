import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println(calc(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
    }
    
    static String calc(int fromH, int fromM, int fromS, int toH, int toM, int toS) {
        int fromSecond = fromH * 3600 + fromM * 60 + fromS;
        int toSecond = toH * 3600 + toM * 60 + toS;
        int totalSecond = toSecond - fromSecond;
        int hour = totalSecond / 3600;
        totalSecond %= 3600;
        int minute = totalSecond / 60;
        totalSecond %= 60;
        return hour + " " + minute + " " + totalSecond;
    }
}

