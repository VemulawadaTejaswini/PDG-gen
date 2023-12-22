import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int v = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();
        int t = sc.nextInt();

        if(a>=b) { System.out.print("YES");return;}
        for(int i=1; i<=t; i++){
            a +=v;
            b +=w;
            if(a>=b){
                System.out.print("YES");
                return;
            }
            if(a>=1000000000&&b>=1000000000) {
                System.out.print("YES");
                return;
            }
        }
        System.out.print("NO");
    }
}