import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Wide = sc.nextDouble();
        double Height = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double ans;
        int flag;
        sc.close();

        if(Wide > Height){
            ans = y*Wide;
            flag = 0;
        }else if(Height > Wide) {
            ans = x*Height;
            flag = 0;
        }else{
            ans = y*Wide;
            flag = 1;
        }

        System.out.println(ans + " " + flag);

    }
}