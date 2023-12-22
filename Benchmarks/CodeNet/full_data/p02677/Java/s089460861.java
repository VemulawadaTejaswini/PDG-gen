import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int A = sn.nextInt();
        int B = sn.nextInt();
        int H = sn.nextInt();
        int M = sn.nextInt();

        int HDgree = M*6;
        int MDgree = H*30;
        int Dgree = 0;
        if(HDgree > MDgree){
            Dgree = HDgree - MDgree;
        }else{
            Dgree = MDgree - HDgree;
        }
        
        Dgree = Math.abs(Dgree);
        System.out.println(Dgree);

        double c = Math.pow(A, 2) + Math.pow(B, 2) - 2*A*B*Math.cos(Math.toRadians(Dgree));

        double result = Math.sqrt(c);

        System.out.println(result);
    }
}