import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int hour, minute, second;
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        minute = input / 60;
        second = input % 60;
        hour = minute / 60;
        minute = minute % 60;

        System.out.println(hour + ":" + minute + ":" + second);
    }
}

