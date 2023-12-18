import java.util.*;
public class Main{
public static int GCD(int a, int b){
    int gcd = 0;
    for(int i = 0;a == 0||b==0;i++){    if(a>=b)
        a = a%b;
    else
        b = b%a;
    }
    if(a!=0)
    gcd=a;
    else
    gcd=b;
    return gcd;
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int ans = 0;
    for(int i = 1; i<=N;i++){
        for(int j = 1; j<=N;j++){
            for (int k =0;k<=N;k++){
            ans = ans+GCD(GCD(i,j),k);
            }
        }   
    }
    
    System.out.println(ans);
        }   
}