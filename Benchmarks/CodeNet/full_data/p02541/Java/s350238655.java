import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=1;
        while ((k*(k+1)/2)%n!=0) {
            k++;
        }
        System.out.println(k);
    }
}
