import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (true) {
            int n=sc.nextInt();
            int[] num;
            int sum=0;
            num=new int[n];

            if (n==0) {
                break;
            }

            for(int i=0;i<n;i++){
                num[i]=sc.nextInt();
                sum+=num[i];
            }
            double ave=(double)sum/n;

            double div=0.0;
            for(int i=0;i<n;i++){
                div+=Math.pow((num[i]-ave),2);

            }
            double a=Math.sqrt(div/n);
            System.out.println(a);
        }

        sc.close();
    
    }
    
}
