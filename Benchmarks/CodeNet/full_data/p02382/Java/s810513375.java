import java.util.Scanner;
public class Main1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double [] x = new double[n];
        double [] y = new double[n];
        for(int a = 0; a < n; a++){
            x[a] = scan.nextDouble();
        }
        for(int a = 0; a < n; a++){
            y[a] = scan.nextDouble();
        }
        System.out.printf("%.6f\n", distance(x,y,1,n));
        System.out.printf("%.6f\n", distance(x,y,2,n));
        System.out.printf("%.6f\n", distance(x,y,3,n));
        System.out.printf("%.6f\n", distance(x,y,4,n));
    }
    public static double distance(double x[], double y[], int p, int n){
        double answer = 0;
        if(p == 4){
            double max = 0;
            for (int a = 0; a < n; a++){
                if(Math.abs(x[a] - y[a]) > max){
                    max = Math.abs(x[a] - y[a]);
                }
            }
            answer = max;

        }
        else if(p == 3){
            for (int a = 0; a < n; a++){
                answer = answer + Math.pow(Math.abs(x[a] - y[a]), p);
            }
            answer = Math.cbrt(answer);
        }
        else if(p == 2){
            for (int a = 0; a < n; a++){
                answer = answer + Math.pow(Math.abs(x[a] - y[a]), p);
            }
            answer = Math.sqrt(answer);

        }
        else{
            for (int a = 0; a < n; a++){
                answer = answer + Math.pow(Math.abs(x[a] - y[a]), p);
            }
            answer = Math.pow(answer, (1/p));
        }
        return answer;
    }
}
