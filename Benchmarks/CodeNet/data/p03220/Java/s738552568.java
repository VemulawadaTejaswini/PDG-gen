import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double T = sc.nextDouble();
        double A = sc.nextDouble();
        int[] H=new int[N];
        double[] tempH=new double[N];
        for(int i=0;i<N;i++){
            H[i]=sc.nextInt();
            tempH[i]=T-0.006*H[i];
        }
        double min=10000;
        int ans=0;
        for(int i=0;i<N;i++){
            if(Math.abs(tempH[i]-A)<min){
                ans=i;
                min=Math.abs(tempH[i]-A);
            }
        }
        System.out.println((int)ans+1);
        System.out.println(min);
    }
}
