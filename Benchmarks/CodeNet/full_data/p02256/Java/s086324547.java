
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner =new Scanner(System.in);
        long x=scanner.nextLong();
        long y=scanner.nextLong();
        System.out.println(gcd(x,y));
    }
    public static long gcd(long x,long y){
        long minXY=Math.min(x,y);
        long maxXY=Math.max(x,y);
        long z=maxXY%minXY;
        if(z==0){
            return minXY;
        }else{
            return gcd(minXY,z);
        }
    }

}

