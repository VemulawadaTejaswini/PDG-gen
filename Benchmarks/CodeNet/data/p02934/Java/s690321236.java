import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tan = new Scanner(System.in);
        while(tan.hasNext()){
            int t=tan.nextInt();
            double sum = 0;
            double[] a = new double[t];
            for (int i = 0; i < t; i++) {
                a[i]=tan.nextDouble();
                sum=sum+1/a[i];
            }
            System.out.println(1/sum);
        }
    }
}
