import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();

        double xlen=Math.abs(x1-x2);
        double ylen=Math.abs(y1-y2);
        System.out.println(""+(int)(x2-ylen)+" "+(int)(y2-xlen)+" "+(int)(x1-ylen)+" "+(int)(y1-xlen));
    }
}