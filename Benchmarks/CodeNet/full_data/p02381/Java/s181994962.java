import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            double sum1=0, sum2=0, ave=0, bun=0, hen=0;
            int n = sc.nextInt();
            if(n==0) break;
            int[] data = new int[n];
            for(int i=0;i<n;i++){
                data[i] = sc.nextInt();
                sum1 += (double)data[i];
            }
            ave = sum1/n;
            for(int i=0;i<n;i++){
                sum2 += (data[i]-ave)*(data[i]-ave);
            }
            bun = sum2/n;
            hen = Math.sqrt(bun);
            System.out.println(hen);
        }
    }
}
