import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int time = 1900*m + 100 * (n-m);
        int times = (int) Math.pow(2,m);
        System.out.print(time * times);
    }
}