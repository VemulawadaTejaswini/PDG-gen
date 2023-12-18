import java.util.*;
public class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        long K = scanner.nextLong();
        if(K%2==0){
            long a = K/2+1;
            System.out.println(2);
            System.out.println(String.format("%d %d", a, a));
        }
        else{
            long a = (K+1)/2;
            System.out.println(2);
            System.out.println(String.format("%d %d", a-1, a+2));            
        }
    }
}