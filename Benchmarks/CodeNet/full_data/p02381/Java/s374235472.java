import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        while(true){
            int sum1=0;
            double sum2=0;
            a=sc.nextInt();
            if(a==0) break;
            int array1[]=new int[a];
            double array2[]=new double[a];
            for(int i=0;i<a;i++) array1[i]=sc.nextInt();
            for(int i=0;i<a;i++) sum1+=array1[i];
            for(int i=0;i<a;i++) array2[i]=Math.pow((double)array1[i]-((double)sum1/a),2);
            for(int i=0;i<a;i++) sum2+=array2[i];
            System.out.println(String.format("%.8f",Math.sqrt(sum2/a)));
        }
        sc.close();
    }
}
