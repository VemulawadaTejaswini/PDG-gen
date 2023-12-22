import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i, j, k;
        double a, b, m, n;
        double[] Score = new double[10000];
        for(i = 0; ; i++){
            int Total = 0;
            double Totalup = 0.0;
            n = sc.nextDouble();
            if(n == 0.0){
                break;
            } else{
                for(j = 0; j < n; j++){
                    Score[j] = sc.nextDouble();
                    Total += Score[j];
                }
                m = Total / n;
            }
            for(k = 0; k < n; k++){
                Totalup += Math.pow(Score[k] - m, 2.0);
            }
            a = Totalup / n;
            b = Math.pow(a, 0.5);
            System.out.println(b);
        }
    }
}
