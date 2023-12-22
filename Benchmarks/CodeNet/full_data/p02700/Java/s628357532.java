import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int x=0;
        int k=0;
        while(true) {
            if (x % 2 == 0) {
                if (c > b) {
                    c -= b;
                    x++;
                } else {
                    k = 1;
                    break;
                }
            }
            else {
                if (a > d) {
                    a -= d;
                    x++;
                } else {
                    k = 2;
                    break;
                }
            }
        }
        if(k==1)
            System.out.println("Yes");
        if(k==2)
            System.out.println("No");
    }
}
