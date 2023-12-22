import java.util.Scanner;
 
public class Main {
     
    static int gcd(int a, int b) {
        if(a<b) {
            return gcd(b,a);
        }
        if(b==0) {
            return a;
        }
        return gcd(b, a%b);
    }
     
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            int[] a=new int[n+1];
            for(int i=0; i<n; i++) {
                a[i]=sc.nextInt();
            }
            int lcm=a[0];
            for(int i=1; i<n; i++) {
                lcm=a[i]*lcm/gcd(a[i], lcm);
            }
            System.out.println(lcm);
        }
    }
}
