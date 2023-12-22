
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        while(n!=0){
            double[] a = new double[n];
            double sum =0, ave;
            for(int i=0;i<n;i++){
                a[i]=scn.nextDouble();
                sum +=a[i];
            }
            ave = sum/n;
            sum=0;
            for(int i=0;i<n;i++){
                sum +=Math.pow(a[i]-ave,2);
            }
            ave = sum/n;
            double sd = Math.sqrt(ave);
            System.out.printf("%.8f%n",sd);
            n=scn.nextInt();

        }

        scn.close();

    }

}
