import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static int gcd(int a, int b){ 
        if (b==0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            if (v1>=v2){
                int ans = gcd(v1,v2);
                System.out.print(ans + " ");
                System.out.println(v1/ans*v2);
            }else{
                int ans = gcd(v2,v1);
                System.out.print(ans + " ");
                System.out.println(v1/ans*v2);
            }
        }
    }
}