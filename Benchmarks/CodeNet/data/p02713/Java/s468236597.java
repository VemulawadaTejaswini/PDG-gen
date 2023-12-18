import java.util.*;

public class Main{

    public static int gcd(int a,int b){
        if(a%b==0) return b;
        return gcd(b,a%b);
    }

    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        long total=0;
        for(int i=1;i<=k;i++){
            for(int j=1;j<=k;j++){
                int g=gcd((int)Math.max(i,j),(int)Math.min(i,j));
                for(int l=1;l<=k;l++){
                    total+=gcd((int)Math.max(g,l),(int)Math.min(g,l));
                }
            }
        }
        System.out.println(total);
    }
}