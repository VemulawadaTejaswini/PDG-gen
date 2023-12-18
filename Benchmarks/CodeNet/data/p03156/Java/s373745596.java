import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        int[] p = new int[n];
        for(int i=0;i<n;i++)
        {
            p[i] = scan.nextInt();
        }
        
        int x = Count_down_A(p,a);
        int y = Count_bw_AB(p,a,b);
        int z = Count_up_B(p,b);
        
        int ans = ThreeMin(x,y,z);
        System.out.println(ans);
    }
    
    static int Count_down_A(int[] p,int a){
        int count = 0;
        for(int i=0;i<p.length;i++)
        {
            if(p[i]<=a)
            {
                count++;
            }
        }
        return count;
    }
    
    static int Count_bw_AB(int[] p,int a,int b){
        int count = 0;
        for(int i=0;i<p.length;i++)
        {
            if(p[i]>a && p[i]<=b)
            {
                count++;
            }
        }
        return count;
    }
    
    static int Count_up_B(int[] p,int b){
        int count = 0;
        for(int i=0;i<p.length;i++)
        {
            if(p[i]>b)
            {
                count++;
            }
        }
        return count;
    }
    
    static int ThreeMin(int a,int b,int c){
        int min = a;
        if(b<min){  min = b;  }
        if(c<min){  min = c;  }
        
        return min;
    }
}