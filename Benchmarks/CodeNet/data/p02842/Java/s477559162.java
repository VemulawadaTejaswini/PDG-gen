import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (double i=1; i<50000; i++){
            double tmp = i*1.08;
            if ((int)tmp==n){
                System.out.println((int)i);
                return;
            }
        }
        System.out.println(":(\n");
        return;

    }
}