import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int x_heads = read.nextInt();
        int y_legs = read.nextInt();

        int countTurtles = ((y_legs) - 2 * (x_heads))/2;
        int countCranes = x_heads - countTurtles;

        //System.out.println(countTurtles);
        //System.out.println(countCranes);

        if(countTurtles >= 0 && countCranes >= 0 && countCranes+countTurtles == x_heads)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
