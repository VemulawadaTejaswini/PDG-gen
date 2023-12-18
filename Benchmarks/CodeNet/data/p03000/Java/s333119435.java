import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int now = 0;
        int count = 0;
        while(now <= m){
            int i = sc.nextInt();
            now += i;
            count++;
        }
        sc.close();
        System.out.println(count);
    }
}