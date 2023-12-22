import java.util.Scanner;
public class Main {
    public static int a;
    public static int b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        int ans = gcd(a,b);
        System.out.println(ans);
        sc.close();
    }
    private static int gcd(int c,int d){
        if (c%d==0) return(d);
	    else return(gcd(d,c%d));
    }
}
