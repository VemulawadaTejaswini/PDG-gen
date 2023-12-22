import java.util.Scanner;
public class C {
    public static void main(String[] args) {
        Scanner kala=new Scanner (System.in);
        
         int N=kala.nextInt();
         
         int a[]=new int[N];
            
         for (int i = 0; i < a.length; i++) {
            a[i]=kala.nextInt();
        }
         int sum=0;
         for (int i = 0; i < N-1; i++) {
             for (int j = i+1; j < N; j++) {
                 sum=sum+a[i]*a[j];
             }
        }
         System.out.println(sum);
        }
}
