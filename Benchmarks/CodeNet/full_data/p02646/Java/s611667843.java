import java.util.Scanner;
import java.util.Random;
import java.math.*;

public class tokyokaijo2{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int v=sc.nextInt();
        int b=sc.nextInt();
        int w=sc.nextInt();
        int t=sc.nextInt();
        int j=0,h=0;
        int x=0,y=0,z=0,c=0;
        j=Math.abs(w);
        h=Math.abs(v);
        if(j-h>0){
            System.out.println("NO");
        }else{
        x=v*t+a;
        y=a-v*t;
        z=w*t+b;
        c=b-w*t;
            if(b>a && x>=z){
                System.out.println("YES");
            }else if(b<a && y<=c){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}