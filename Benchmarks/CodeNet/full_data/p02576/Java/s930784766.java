import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOf = input.nextInt();
        int numberAtATime = input.nextInt();
        double timeToMake = input.nextInt();
        double timeToMake2;
        double timeToMake3;


        timeToMake3 = timeToMake * Math.floor(numberOf / numberAtATime) + timeToMake;
        if (numberOf % numberAtATime == 0)
        {
            timeToMake2 = timeToMake * Math.floor(numberOf / numberAtATime);
            System.out.print((int)timeToMake2);
        }
        else {
            System.out.println((int)timeToMake3);
        }
    }
}