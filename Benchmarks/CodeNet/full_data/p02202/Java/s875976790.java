import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long ans=0;
        for(int i=0;i<n;i++)ans+=sc.nextInt();
        System.out.println(ans-n*(n+1)/2);
    }
    
}
