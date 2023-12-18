import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long S = sc.nextLong();
        sc.close();

        long x1,x2,x3,y1,y2,y3;

        x1 = 0; y1 = 0;
        x2 = (long)Math.pow(10, 9);
        y2 = 1;
        x3 = x2 - S/x2;
        y3 = (S+x3) / x2;

        System.out.println(x1 + " " + y1 + " " + x2 + " " + y2 + 
                            " " + x3 + " " + y3);

    }
}