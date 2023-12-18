import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        String input = s.nextLine();
        if(input.equals(week[0])) {
            System.out.println("It is Sunday today, and seven days later, it will be Sunday again.");
        }
        else if (input.equals(week[6])) {
            System.out.println("It is Saturday today, and tomorrow will be Sunday");
        }
        else {
            int i=0;
            while (!input.equals(week[i])) {
                i++;
            }
            System.out.println((7-i) + "day(s) later");
        }
    }
}
