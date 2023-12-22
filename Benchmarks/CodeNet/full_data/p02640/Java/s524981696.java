import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int x_heads = read.nextInt();
        int y_legs = read.nextInt();

        int turtle=y_legs/2-x_heads;

        int crane=x_heads-turtle;

        //System.out.println(turtle);
        //System.out.println(crane);

        if(turtle==Math.floor(turtle) && crane==Math.floor(crane) && turtle>=0 && crane>=0 && x_heads<y_legs)
            System.out.println("Yes");

        else
            System.out.println("No");


    }
}
