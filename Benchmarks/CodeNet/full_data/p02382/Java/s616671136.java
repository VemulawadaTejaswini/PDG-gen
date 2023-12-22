import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

class Main{
    
    public static void main(String[] arg){

        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        int n = Integer.parseInt(input);

        int[] x = new int[n];
        int[] y = new int[n];
        int[] x_y = new int[n];

        input = in.nextLine();
        String [] param_line = input.split(" ", 0);
        for(int i=0; i<x.length; i++){
            x[i] = Integer.parseInt(param_line[i]);
        }

        input = in.nextLine();
        param_line = input.split(" ", 0);
        for(int i=0; i<y.length; i++){
            y[i] = Integer.parseInt(param_line[i]);
        }

        for(int i=0; i<x_y.length; i++)
            x_y[i] = x[i] = y[i];

        double sum = 0.0;
        for(int i=0; i<x_y.length; i++){
            sum += x_y[i];
        }
        double p1 = sum/x_y.length;
        System.out.printf("%.8f\n",p1);


    }
}