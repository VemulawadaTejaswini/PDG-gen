import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws Exception {


        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");
        sc.close();
        double x1 = Double.parseDouble(arr[0]);
        double x2 = Double.parseDouble(arr[1]);
        double y1 = Double.parseDouble(arr[2]);
        double y2 = Double.parseDouble(arr[3]);

        double x = Math.pow((y1-x1), 2);
        double y = Math.pow((y2-x2), 2);

        double n = Math.sqrt(x+y);

        System.out.println(n);
    }

}