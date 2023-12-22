import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputSecond = scanner.nextInt();

        int hour   =  inputSecond / 3600;
        int minute =  inputSecond / 60 - hour*60;
        int second =  inputSecond % 60;

        System.out.println(hour+":"+minute+":"+second);

    }
}

