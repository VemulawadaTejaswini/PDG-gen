import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        long s = n;
        int k = 0;
        while(s != 0){
            s = s / 10;
            k++;
        }
        if(n < 10){
            System.out.println(n);
        }else{
            if(Math.pow(10 , k) - 1 == n){
                System.out.println(9 * k);
            }else{
                int x = (int)(n / (long)Math.pow(10 , k - 1));
                System.out.println(9 * k + x - 10);
            }
        }
        
    }
}