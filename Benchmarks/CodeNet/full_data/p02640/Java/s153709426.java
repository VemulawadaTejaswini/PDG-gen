import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int totalAnimals = userInput.nextInt();
        int totalLegs = userInput.nextInt();

        if(totalAnimals * 2 == totalLegs && 2*totalAnimals <= totalLegs && totalLegs < 4*totalAnimals)
        {
            System.out.println("Yes");
        }
        else
            {
                System.out.println("No");
            }

    }
}