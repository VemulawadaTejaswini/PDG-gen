import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        Long sum1 = 0L;
        Long sum2 = 0L;
        Long sum3 = 0L;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                for(int k=j;k<=n;k++){
                    Integer tmp = gcd(i, gcd(j, k));
                    if(i==j && i==k)sum1 += tmp;
                    else if(i==j || j==k || k==i)sum2 += tmp;
                    else sum3 += tmp;
                }
            }
        }

        System.out.println(sum1 + sum2*3 + sum3*6);

    }
    
    private static int gcd(int x, int y) {
        if(y > x)return gcd(y, x);
        if(y==0)return x;
        return gcd(y, x%y);
    }
}