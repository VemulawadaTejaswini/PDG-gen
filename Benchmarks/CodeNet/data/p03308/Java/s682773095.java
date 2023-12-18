import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
            max=Math.max(ar[i], max);
            min=Math.min(ar[i], min);
        }
        double b=max-min;
        int c=(int)Math.abs(b);
        System.out.println(c);
    }    
}