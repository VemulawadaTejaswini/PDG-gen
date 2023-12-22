import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        int t = sc.nextInt();
        double s = sc.nextDouble();

        int re = (int)(d/s + (double)(s-1)/(double)s);

        if(re>t){
          System.out.println("No");
        }else{
            System.out.println("Yes");
        }


    }
}