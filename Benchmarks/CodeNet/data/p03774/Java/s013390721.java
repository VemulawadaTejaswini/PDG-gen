import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[m];
        int[] y2 = new int[m];
        
        for(int i=0;i<x1.length;i++)
        {
            x1[i] = scan.nextInt();
            y1[i] = scan.nextInt();
        }
        for(int i=0;i<x2.length;i++)
        {
            x2[i] = scan.nextInt();
            y2[i] = scan.nextInt();
        }
        
        int min,tmp;
        for(int i=0;i<x1.length;i++)
        {
            min = 2147483647;tmp=0;
            for(int j=0;j<x2.length;j++)
            {
                int dist = manhattan(x1[i],y1[i],x2[j],y2[j]);
                if(dist < min)
                {
                    min = dist;
                    tmp = j+1;
                }
            }
            System.out.println(tmp);
        }
    }
    
    static int manhattan(int a,int b,int c,int d){
        return (Math.abs(a-c) + Math.abs(b-d));
    }
}