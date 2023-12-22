import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i;
        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;
        double sum4 = 0;
        double ans2,ans3,ans4;
        double[] array_x,array_y;
        array_x = new double[1000];
        array_y = new double[1000];
        for(i = 0; i < n; i++){
        	array_x[i] = scan.nextDouble();
        }
        for(i = 0; i < n; i++){
        	array_y[i] = scan.nextDouble();
        }
        for(i = 0; i < n; i++){
        	sum1 += Math.abs(array_x[i] - array_y[i]);
        	sum2 += (array_x[i] - array_y[i]) * (array_x[i] - array_y[i]);
        	sum3 += Math.abs(array_x[i] - array_y[i]) * Math.abs(array_x[i] - array_y[i]) * Math.abs(array_x[i] - array_y[i]);
        }
        for(i = 0; i < n - 1; i++){
        	sum4 += array_x[i] - array_x[i + 1];
        }
        ans2 = Math.sqrt(sum2);
        ans3 = Math.cbrt(sum3);
        ans4 = Math.abs(sum4);
        System.out.println(sum1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
            }
}



		

	