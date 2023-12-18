import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        Double a = new Double(sn.nextInt());
        Double b = new Double(sn.nextInt());
        Double c = new Double(sn.nextInt());

        Double right = Math.sqrt(a) + Math.sqrt(b);
        Double left = Math.sqrt(c);
        if(right < left){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}