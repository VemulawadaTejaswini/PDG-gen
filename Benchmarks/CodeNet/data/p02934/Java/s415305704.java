import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double[] A = new double[a];
        double sum = 0.0;
        double seki = 1.0;
        for(int i = 0;i < a;i++){
            A[i] = 1.0/sc.nextDouble();
            sum += A[i];
            
        } 

        double ans = 1.0/sum;
        System.out.println(ans);

    }
}