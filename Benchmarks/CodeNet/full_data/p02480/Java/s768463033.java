import java.util.Scanner;

/**
 *
 * @author Dranzers
 */
Class Pangkat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 0, b = 3;
        double c = 0;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        c = (int) Math.pow(a, b);
        System.out.println(c);
    }
}