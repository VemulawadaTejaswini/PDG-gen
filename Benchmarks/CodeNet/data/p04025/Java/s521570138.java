import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] b = new int[a+1];
        int x = 0;
        for (int i = 1; i < a+1; i++) {
            b[i]=in.nextInt();
            x+=b[i];
        }
        double d = x/1.0;
        d = Math.ceil(d/a);
        double y = 0;
        for (int i = 1; i < a+1; i++) {
            if(d!=b[i]){
                y+=Math.pow((b[i]-d), 2);
            }
        }
        
        System.out.printf("%.0f\n",y);
    }
}
