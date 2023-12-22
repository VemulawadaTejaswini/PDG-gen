import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        
        
        int[] x = new int[n+1];
        int[] y = new int[n+1];
        for(int i = 1;i <= n;i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            
        }
        
        
        int count,pow;
        int[] cango = new int[n+1];//まちk,いける一覧
        for(int i = 1;i <= n;i++){//今いるまちk
            for(int j = 1;j <= n;j++){
                if((x[i] <= x[j] && y[i] <= y[j]) || (x[i] > x[j] &&y[i] > y[j])){
                    cango[i] +=  Math.pow(2,j-1);
                } 
                count = 0;
            }
            
            
        }
        
        int a=0,bits=0;
        for(int i = 1;i <= n;i++){
            a = cango[i];
            //System.out.print(a+" ");
            
            for(int j = 1;j <= n;j++){
                if((cango[i] & (int)Math.pow(2,j-1)) != 0){
                        a |= cango[j];
                }
            }
            
            System.out.println(Integer.bitCount(a));
        }
        
        
        
        
    }
}