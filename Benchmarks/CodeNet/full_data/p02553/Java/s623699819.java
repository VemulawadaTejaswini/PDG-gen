import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        
        long a1 = a * c;
        long a2 = a * d;
        long a3 = b * c;
        long a4 = b * d;
                
        long b1 = Math.max(a1, a2);
        long b2 = Math.max(a3, a4);
        long ans = Math.max(b1, b2);
        
        System.out.println(ans);      
        
    }
}