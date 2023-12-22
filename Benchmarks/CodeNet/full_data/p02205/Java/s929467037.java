import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long a=sc.nextInt();
        long b=sc.nextInt();
        n%=12;
        for(int i=1;i<n+1;i++){
            if(i%2==1)a=a-b;
            else b=a+b;
        }
        System.out.println(a+" "+b);
    }
    
}
