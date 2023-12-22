import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int test=in.nextInt();
        double a[]=new double [test];
        double b[]=new double [test];
        for (int i = 0; i <test; i++) {
            a[i]=in.nextDouble();
        }
        for (int i = 0; i <test; i++) {
            b[i]=in.nextDouble();
        }
        double ans1=0,ans2=0,max=0,ans3=0,ans4=-999999999;
        for (int i = 0; i < test; i++) {
            ans1=ans1+(Math.abs((a[i]-b[i])));
            ans2=ans2+(((a[i]-b[i]))*((a[i]-b[i])));
            ans3=ans3+((Math.abs(a[i]-b[i]))*(Math.abs(a[i]-b[i]))*(Math.abs(a[i]-b[i])));
            max=Math.abs(a[i]-b[i]);
            if(ans4<max){
                ans4=max;
            }
        }
        System.out.printf("%.6f\n",ans1);
        System.out.printf("%.6f\n",Math.sqrt(ans2));
        System.out.printf("%.6f\n",Math.pow(ans3, (1.0/3.0)));
        System.out.printf("%.6f\n",ans4);
    }
}
