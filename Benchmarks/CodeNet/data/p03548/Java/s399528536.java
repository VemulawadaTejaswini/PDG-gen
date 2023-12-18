import java.util.*;
import java.lang.*;


public class Main {
    static int pow(int a, int b){
        int ans = 1;
        for(int i=0; i<b; i++) ans *= a;
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();

        System.out.println((X-Z)/(Y+Z));

    }
}
