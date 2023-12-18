import java.util.*;
public class Screw {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[2*n];
        for(int i=0;i<2*n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int t=0;
        for(int i=0;i<2*n;i+=2)
        {
            t+=Math.min(a[i],a[i+1]);
        }
        System.out.println(t);
    }
    
}
