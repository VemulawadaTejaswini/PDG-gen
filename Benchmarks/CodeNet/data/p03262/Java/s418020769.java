import java.util.*;

public class Main {
    static int gcd(int x,int y){
        if (x<y)gcd(y,x);
        if (x%y==0)return y;
        return gcd(y,x%y);
    }
	public static void main(String[] args)  {
         Scanner scan =new Scanner(System.in);

         int n=Integer.parseInt(scan.next());
         int[] x = new int [n+1];
         for(int i = 0; i < n+1; ++i){
             x[i] = Integer.parseInt(scan.next());
         }
         Arrays.sort(x);
         int ans=x[1]-x[0];
         for (int i=0;i<n;++i){
             ans=gcd(ans,x[i+1]-x[i]);
         }
         System.out.print(ans);


}
}
//end