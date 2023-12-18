import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int n1 = n+1;
        int m[] = new int[n1];
        int h[] = new int[n];
        for (int i = 0; i < n1; i++) {
            m[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            h[i] = scan.nextInt();
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            int xh = h[i];
            if(xh >= m[i]){
                result+=m[i];
                xh-=m[i];
               if(xh>=m[i+1]){
                   result+=m[i+1];
                   m[i+1]=0;
               }else{
                   result+=xh;
                   m[i+1]-=xh;
               }
            }else{
                m[i]-=xh;
                result+=xh;
            }
        }

        System.out.println(result);
    }
}
