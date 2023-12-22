import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        long A = sn.nextLong();
        double B = sn.nextDouble();

        System.out.println((long)Math.floor(A*B));
    }
}