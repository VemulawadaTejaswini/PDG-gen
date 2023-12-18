import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(m>=0)System.out.println(n*(n-1)/2+m*(n-1));
        else if(n+m>0)System.out.println(n*(n-1)/2+m*n);
        else System.out.println(n*(n-1)/2+m*n-(n+m-1));
    }
}
