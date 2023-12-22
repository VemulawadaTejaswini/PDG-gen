import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        int n;
        
        while( !((n=sc.nextInt())==0) ){
            int[] a=new int[n];
            double sum=0.0;
            double sum2=0.0;
            double s;
            for(int i=0; i<n ;i++){
                a[i]=sc.nextInt();
                /*System.out.println(a[i]);*/
                sum+=(double)a[i]/n;
                sum2+=(double)a[i]*a[i]/n;
            }
            /*System.out.println(sum);*/
            /*System.out.println(sum2);*/
            s=(double)Math.sqrt((double)(sum2-sum*sum));
            System.out.println(String.format("%.8f",s));
            
        }
        
    }
}
