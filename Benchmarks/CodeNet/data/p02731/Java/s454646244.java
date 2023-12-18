import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        double l,ans;

        l=sc.nextDouble();
        l/=3;
        ans=l*l*l;

        System.out.println(String.format("%.7f",ans));
        sc.close();
    }
}