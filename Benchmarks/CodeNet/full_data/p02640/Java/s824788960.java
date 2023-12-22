import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numAnimals = sc.nextInt();
        int numFeet = sc.nextInt();

        int maxFeet = 4 * numAnimals;
        int minFeet = 2 * numAnimals;

        if(minFeet <= numFeet && numFeet <= maxFeet && numFeet % 2 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}