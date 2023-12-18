import java.util.Scanner;
 
public class Main {
    public static long gcd(long m, long n) {
        if(m < n){
            return gcd(n, m);
        }
        
        if(n == 0){
            return m;
        }
        
        return gcd(n, m % n);
    }
    
    public static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }
    
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
 
        int n = stdIn.nextInt();
        int a[] = new int[n];
        long sum = 0;
        //int min = 10000000;
        //int count = 0;
        //int c = stdIn.nextInt();
        //int x = stdIn.nextInt();
        
        for(int i = 0; i < n; i++){
            a[i] = stdIn.nextInt();
        }
        
        long saisyo = a[0];
        
        for(int i = 0; i < n; i++){
            saisyo = lcm(saisyo, a[i]);
        }
        //String s = stdIn.next();
        //String t = stdIn.next();
        //char c[] = s.toCharArray();
        
        //c[0] += 1;
        //int sum = 0;
        //boolean flag = true;
        
        for(int i = 0; i < n; i++){
            sum += (saisyo / a[i]) % 1000000007;
        }
        
        System.out.println(sum);
        //System.out.println();
        //System.out.print();
        
        //System.out.println(2425 % 10);
 
        stdIn.close();
    }
}