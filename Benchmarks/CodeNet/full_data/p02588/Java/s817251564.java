import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        double [] ar=new double[(int) t];
        for (long i=0;i<t;i++){
            ar[(int) i]=sc.nextDouble();
        }
        long sum=0;
        for (long i=0;i<t;i++){
            for (long j=i+1;j<t;j++)
            {
                double var=ar[(int) i]*ar[(int) j];

                if(Math.ceil(var)==var){
                    System.out.println(var+" "+ar[(int) i]+"*"+ar[(int) j]);
                    sum++;
                }

            }
        }
        System.out.println(sum);
    }
}
