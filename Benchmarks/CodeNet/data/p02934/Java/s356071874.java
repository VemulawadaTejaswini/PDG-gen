
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Main {
    public static boolean debug = true;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] input = new double[n];

        double temp =0;
        for(int i =0; i<n ; i++){
            input[i] = sc.nextDouble();

            temp = temp + (1/input[i]);
        }

        System.out.println(1/temp);


    }
    public static void d(String message){
        if(debug){
            System.out.println(message);
        }
    }
}
