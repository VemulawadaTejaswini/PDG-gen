
import java.util.Scanner;

public class Main{



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        long t=scanner.nextLong();
//        long[] a=new long[n];
//        long[] b=new long[n];
//        long[] c=new long[n];
//        for(int j=0;j<n;j++){
//            a[j]=scanner.nextLong();
//            b[j]=scanner.nextLong();
//            c[j]=(long)((long)a[j]+(long)b[j]);
//        }

        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        double aa=(double)((double)2*(double)Math.sqrt((double)((double)a*(double)b)))-(double)c+(double)a+(double)b;
        if((double)aa < (double)0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
