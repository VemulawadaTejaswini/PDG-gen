import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        int[] x = new int[n];
        int[] y = new int[n];
        
        for(int i=0;i<n;i++){x[i]=sc.nextInt();}
        for(int i=0;i<n;i++){y[i]=sc.nextInt();}
        
        double[] lst = new double[4];
        double z ;
        
        for(int i=0;i<n;i++){
            z = Math.abs(x[i]-y[i]);
            lst[0]+=z;lst[1]+=z*z;lst[2]+=z*z*z;lst[3]=Math.max(z,lst[3]);
        }
        
        for(int i=0;i<3;i++){
            System.out.println(Math.pow(lst[i],1/(double)(i+1)));
        }
        System.out.println(lst[3]);
    }
}
