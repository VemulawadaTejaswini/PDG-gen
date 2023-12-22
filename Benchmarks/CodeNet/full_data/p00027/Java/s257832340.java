import java.util.*;

class Main {

    static void solve (int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(2004, month - 1, day);

        switch (cal.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY:
                System.out.println("Sunday");
                break;
            case Calendar.MONDAY:
                System.out.println("Monday");
                break;
            case Calendar.TUESDAY:
                System.out.println("Tuesday");
                break;
            case Calendar.WEDNESDAY:
                System.out.println("Wednesday");
                break;
            case Calendar.THURSDAY:
                System.out.println("Thursday");
                break;
            case Calendar.FRIDAY:
                System.out.println("Friday");
                break;
            case Calendar.SATURDAY:
                System.out.println("Saturday");
                break;
        }


    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            int month = sc.nextInt();
            int day = sc.nextInt();

            if (month == 0) break;

            solve(month, day);

        }

    }
}