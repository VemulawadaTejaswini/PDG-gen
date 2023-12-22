import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            if(n==0)break;
            int[] set=new int[n];
            int sum=0;
            double m;
            for(int i=0;i<n;i++){
                set[i]=sc.nextInt();
                sum+=set[i];
            }
            m=(double)sum/(double)n;
            double V=0;
            for(int i=0;i<n;i++){
                V+=Math.pow(set[i]-m, 2);
            }
            V=V/(double)n;
            double SD=Math.sqrt(V);
            System.out.println(SD);
        }
    }
}