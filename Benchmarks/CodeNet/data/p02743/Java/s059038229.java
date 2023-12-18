import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double ar = Math.sqrt(a);
        //System.out.println(ar);
        double br = Math.sqrt(b);
        //System.out.println(ar);
        double cr =c - a - b;
        if ((ar*br)<=cr){
        System.out.println(Yes);
        }else{
        System.out.println(No);
        }
    }
}

