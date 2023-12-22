import java.util.*;

class Main{
    public static long min(long a,long b){
        return (a<b)?a:b;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        long B=sc.nextLong();
        long N=sc.nextLong();
        
        long ans=min(B-1,N);
        
        double xdivB=(double)(ans)/(double)(B);
        
        while(xdivB>1){
            xdivB/=10;
        }
        
        xdivB*=A;
        
        System.out.println((int)(xdivB));
    }
}