import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int v = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();
        int t = sc.nextInt();

        int diff = b-a;
        int c = v-w;

        if(a>=b) {
            System.out.print("YES");
            return;
        }
        if (c<0) {
            System.out.print("NO");
            return;
        }
        for(int i=1; i<=t; i++){
            diff = diff - c;
            if(diff<=0) {
                System.out.print("YES");
                return;
            }
        }
        System.out.print("NO");
    }
}