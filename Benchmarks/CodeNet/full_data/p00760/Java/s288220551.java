import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static int CURRENT_YEAR = 1000;
    public static int CURRENT_MONTH = 1;
    public static int CURRENT_DAY = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peopleCount = Integer.valueOf(sc.nextLine());

        for (int i = 0; i < peopleCount; i ++) {
            System.out.println(calculateDays(sc.nextLine()));
        }

    }

    public static int calculateDays(String YMD) {
        int birthYear = Integer.valueOf(YMD.split(" ")[0]);
        int birthMonth = Integer.valueOf(YMD.split(" ")[1]);
        int birthDay = Integer.valueOf(YMD.split(" ")[2]);

         int daysFromBirthYear = 1;

        // by years
        for (int y = birthYear; y < CURRENT_YEAR; y++) {
            if(y % 3 == 0) {
                daysFromBirthYear += 200;
            } else {
                daysFromBirthYear += 195;
            }
        }

        int dayOfBorn = 0;
        if(birthYear % 3 == 0) {
            dayOfBorn = (birthMonth - 1) * 20 + birthDay;
        } else {
            for (int m = 1; m < birthMonth; m ++) {
                dayOfBorn += m % 2 == 0 ? 19 : 20;
            }
            dayOfBorn += birthDay;
        }


        return daysFromBirthYear - dayOfBorn;
    }
}
