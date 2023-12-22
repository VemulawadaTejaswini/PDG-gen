import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int month = sc.nextInt();
            int day = sc.nextInt();
            if(month == 0 && day == 0){
                break;
            }else{
                weekCheck(month, day);
            }
        }
    }
    public static void weekCheck(int month, int day){
        int numberOfDays[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int weekDifference = 0;
        if(month == 1){
            weekDifference = day;
        }else{
            for(int i = 0; i < month -1 ; i++){
                weekDifference += numberOfDays[i];
            }
            weekDifference += day;
        }
        switch((weekDifference) % 7){
            case 1:
                System.out.println("Thursday");
                break;
            case 2:
                System.out.println("Friday");
                break;
            case 3:
                System.out.println("Saturday");
                break;
            case 4:
                System.out.println("Sunday");
                break;
            case 5:
                System.out.println("Monday");
                break;
            case 6:
                System.out.println("Tuesday");
                break;
            case 0:
                System.out.println("Wednesday");
                break;
        }
    }
}
