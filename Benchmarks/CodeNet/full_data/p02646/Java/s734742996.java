import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long v = sc.nextInt();
        long b = sc.nextInt();
        long w = sc.nextInt();
        long t = sc.nextInt();

        if(w >= v){
            System.out.println("NO");
            return;
        }
        if(Math.abs(a - b) <= Math.abs(v - w) * t){
            System.out.println("YES");
            return;
        }


        System.out.println("NO");

    }

}
