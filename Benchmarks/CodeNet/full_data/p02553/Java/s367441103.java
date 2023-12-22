import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        long x;
        long y;
        long s;
        long t;
        long z;
        long zz;
        long zzz;
        

        	s=a*c;
        	t=b*d;
        	x=a*d;
        	y=b*c;
        	zz=Math.max(s,t);
        	zzz=Math.max(zz,x);
        	z=Math.max(zzz,y);

        
        System.out.println(z);
        

    }
}
