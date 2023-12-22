import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws Exception {

        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split("[\\s]");
        sc.close();
        double x1 = Integer.parseInt(array[0]);
        double x2 = Integer.parseInt(array[1]);
        double y1 = Integer.parseInt(array[2]);
        double y2 = Integer.parseInt(array[3]);

        double x = Math.pow((y1-x1), 2);
        double y = Math.pow((y2-x2), 2);

        double n = Math.sqrt(x+y);

        System.out.println(n);
    }

}