import java.util.*;
public class shimu{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >= 13){
            System.out.println(b);
        }
        if (6 <= a && a <= 12){
            System.out.println(b/2);
        }
        if (a<6){
            System.out.println(0);
        }
        sc.close();
    }
}